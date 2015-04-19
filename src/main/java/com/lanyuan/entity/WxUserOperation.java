/**
 * 
 */
package com.lanyuan.entity;

import java.util.Date;

/**
 * @author Administrator
 *
 */
public class WxUserOperation implements java.io.Serializable {
	private static final long serialVersionUID = 8187036776916122341L;
	private int id;
	private int userId;
	private String operateType;	//collectionArticle、likeButton、subscribeKeyword、subscribeClass、increaseReadNum
	private int operateId;	//相关表的id，依据operateType来确定，可以为空
	private String description;	//操作描述：
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
	public String getOperateType() {
		return operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}
	public int getOperateId() {
		return operateId;
	}
	public void setOperateId(int operateId) {
		this.operateId = operateId;
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
