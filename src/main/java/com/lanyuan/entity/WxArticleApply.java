/**
 * 
 */
package com.lanyuan.entity;

import java.util.Date;

/**
 * @author Administrator
 *
 */
public class WxArticleApply implements java.io.Serializable {
	private static final long serialVersionUID = -779612521641571940L;
	private int id;
	private int userId;
	private String username;
	private String content;
    private Date createDate;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
    
}
