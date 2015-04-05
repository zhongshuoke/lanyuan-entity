package com.lanyuan.entity;

/**
 * 城市实体类
 * @author caokun
 *
 */
public class City {
	
	/*城市ID*/
	private int id;
	
	/*城市名称*/
	private String cityName;

   

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", cityName=" + cityName + "]";
	}
	
}
