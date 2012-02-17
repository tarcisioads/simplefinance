package example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.naming.*;
import javax.sql.*;
import java.sql.*;

/**
 * Hello world!
 * 
 */
public class HelloServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		int day=0, month=0, year = 0;
		double value=0;
		String desc="";
		
		String txtvalue = req.getParameter("txtvalue").toString();
		//String txtvalue = "07/02 150.55 bla";
		resp.getWriter().println(txtvalue); 
		String[] aux = txtvalue.split(" ");
		if (aux.length<3){
			resp.getWriter().println("Invalid Systax!");
			return;
		}
		try{
			String[] aux2 = aux[0].split("/");
			day = Integer.parseInt(aux2[0]);
			month = Integer.parseInt(aux2[1]);
			if (aux2.length>2)
				year = Integer.parseInt(aux2[2]);
			else
				year = 2012;
			
		}catch (NumberFormatException e){
			resp.getWriter().println("Invalid Systax!");
			return;
		}
		try{
			value = Double.parseDouble(aux[1]);
		}catch (NumberFormatException e){
			resp.getWriter().println("Invalid Systax!");
			return;
		}
		
		for (int i=2;i<aux.length;i++){
			desc += " "+aux[i];
		}
		
		Context ctx;
		try {
			ctx = new InitialContext();
			DataSource ds = (DataSource) ctx
					.lookup("java:comp/env/jdbc/simplefinance");
			Connection conn;
			conn = ds.getConnection();
			Statement stmt = conn.createStatement();

			
			String sql = "INSERT INTO LANC(LANC_DAY, LANC_MONTH, LANC_YEAR, LANC_VALUE, LANC_DESC) VALUES("+day+","+month+","+year+","+value+",'"+desc+"')";
            			
			stmt.executeUpdate(sql);
			
			conn.close();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		resp.sendRedirect("http://simplefinance.tarcisioads.cloudbees.net/");
	}
}
