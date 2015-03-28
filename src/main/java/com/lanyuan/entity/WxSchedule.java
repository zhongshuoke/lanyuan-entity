package com.lanyuan.entity;


import com.lanyuan.util.ExcelDataMapper;

/**
 * 微信抓取计划实体表
 */
@SuppressWarnings("serial")
public class WxSchedule implements java.io.Serializable{
	
	private int id;

	/*计划分钟数*/
	private String minute;
	
	/*计划小时数*/
	private String hour;
	
	/*week*/
    private String day_of_week;
    
	/*month*/
    private String day_of_month;
    
	/*year*/
    private String month_of_year;

    @ExcelDataMapper(title="id",order=1)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ExcelDataMapper(title="minute",order=2)
	public String getMinute() {
		return minute;
	}

	public void setMinute(String minute) {
		this.minute = minute;
	}

	@ExcelDataMapper(title="hour",order=3)
	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	@ExcelDataMapper(title="dayofweek",order=4)
	public String getDay_of_week() {
		return day_of_week;
	}

	public void setDay_of_week(String day_of_week) {
		this.day_of_week = day_of_week;
	}

	@ExcelDataMapper(title="dayofmonth",order=5)
	public String getDay_of_month() {
		return day_of_month;
	}

	public void setDay_of_month(String day_of_month) {
		this.day_of_month = day_of_month;
	}

	@ExcelDataMapper(title="monthofyear",order=6)
	public String getMonth_of_year() {
		return month_of_year;
	}

	public void setMonth_of_year(String month_of_year) {
		this.month_of_year = month_of_year;
	}

}
