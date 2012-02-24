package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lanc")
public class Lanc {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="LANC_ID")
	private int id;
	@Column(name="LANC_DAY")
	private int day;
	@Column(name="LANC_MONTH")
	private int month;
	@Column(name="LANC_YEAR")
	private int year;
	@Column(name="LANC_VALUE")
	private double value;
	@Column(name="LANC_DESC")
	private String desc;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getDay() {
		return day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getMonth() {
		return month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public double getValue() {
		return value;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc() {
		return desc;
	}
	
}
