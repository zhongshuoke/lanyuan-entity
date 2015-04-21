/**
 * 
 */
package com.lanyuan.entity;

import java.util.Date;

/**
 * @author Administrator
 * 图片管理类
 *
 */
public class WxPicOperation implements java.io.Serializable {
	private static final long serialVersionUID = -6030095386115352172L;
	private int id;
	private String picType;	//图片类型  AD(广告),CLASS(类别),推荐(RE)
	private int classId;	//相关表的id，依据picType来确定，可以为空
	private String description;	//图片描述
    private Date createDate;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPicType() {
		return picType;
	}
	public void setPicType(String picType) {
		this.picType = picType;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
