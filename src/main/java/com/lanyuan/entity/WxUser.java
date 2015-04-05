package com.lanyuan.entity;


import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import com.lanyuan.util.JsonDateSerializer;

/**
 * 众说客注册用户实体表
 */
@SuppressWarnings("serial")
public class WxUser implements java.io.Serializable{
	
	private int id;

	/*用户名(库里唯一)*/
	private String username;
	
	/* 密码 */
	private String password;
	
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
    
    /* 用户登陆后的token标识，MD5(name+密码+new Date().getTime()) */
    private String token;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
