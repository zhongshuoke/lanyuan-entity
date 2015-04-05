package com.lanyuan.entity;

/**
 * 城市实体类
 * @author caokun
 *
 */
public class City {
	
	/*城市ID*/
	private int cityId;
	
	/*城市名称*/
	private String cityName;

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName + "]";
	}
	
}
