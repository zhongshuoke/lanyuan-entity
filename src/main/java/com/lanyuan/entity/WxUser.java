package com.lanyuan.entity;


import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.lanyuan.util.ExcelDataMapper;
import com.lanyuan.util.JsonDateSerializer;

/**
 * 众说客注册用户实体表
 */
@SuppressWarnings("serial")
public class WxUser implements java.io.Serializable{
	
	private int id;

	/*用户名(库里唯一)*/
	private String name;
	
	/*昵称*/
	private String nickName;
	
	/*性别*/
	private String sex;

	/*手机号*/
    private String cellPhoneNo;
    
    /*所在地 province/city*/
    private String location;
    
    /*邮箱*/
    private String email;
    
    /*注册时间*/
    private Date registerDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCellPhoneNo() {
		return cellPhoneNo;
	}

	public void setCellPhoneNo(String cellPhoneNo) {
		this.cellPhoneNo = cellPhoneNo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*时间格式化*/
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}
