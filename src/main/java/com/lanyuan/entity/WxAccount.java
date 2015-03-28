package com.lanyuan.entity;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.lanyuan.util.ExcelDataMapper;
import com.lanyuan.util.JsonDateSerializer;

/**
 * 微信公众号实体表
 */
@SuppressWarnings("serial")
public class WxAccount implements java.io.Serializable{
	
	private int id;

	/*微信账号名称*/ 
	//譬如 近铁城市广场
	private String wxAccountName;
	
	/*微信账号*/
	//譬如 mtrcity1325
	private String wxAccountNo;
	
	/*微信公众号类型*/
	//标识这个公众号是什么类型的，譬如新闻，娱乐，养生，数码等
	private String wxType;
	
	/*微信公众号说明*/
	private String description;
	
	/*账号状态*/
	//0 表示停用  1表示启用
	private String state;
	
	/*录入时间*/
	private Date createTime;
	@ExcelDataMapper(title="id",order=1)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ExcelDataMapper(title="微信账号名称",order=2)
	public String getWxAccountName() {
		return wxAccountName;
	}

	public void setWxAccountName(String wxAccountName) {
		this.wxAccountName = wxAccountName;
	}
	
	@ExcelDataMapper(title="微信账号",order=3)
	public String getWxAccountNo() {
		return wxAccountNo;
	}

	public void setWxAccountNo(String wxAccountNo) {
		this.wxAccountNo = wxAccountNo;
	}

	@ExcelDataMapper(title="公众号类型",order=4)
	public String getWxType() {
		return wxType;
	}

	public void setWxType(String wxType) {
		this.wxType = wxType;
	}

	@ExcelDataMapper(title="公众号描述",order=5)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@ExcelDataMapper(title="公众号状态",order=6)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	/*时间格式化*/
	@ExcelDataMapper(title="创建时间",order=7)
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "WxAccount [id=" + id + ", wxAccountName=" + wxAccountName
				+ ", wxAccountNo=" + wxAccountNo + ", wxType=" + wxType
				+ ", description=" + description + ", state=" + state
				+ ", createTime=" + createTime + "]";
	}
}
