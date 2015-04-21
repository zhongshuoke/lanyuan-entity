/**
 * 
 */
package com.lanyuan.entity;

import java.util.Date;

/**
 * 广告
 * @author heyuxing
 *
 */
public class Advertisement {
	private int id;
	
	//广告标题
	private String title;
	
    //广告地址
	private String url;
	
    //广告图片路径
	private String picurl;
	
	/*创建时间*/
    private Date createTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPicurl() {
		return picurl;
	}

	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}
	
}
