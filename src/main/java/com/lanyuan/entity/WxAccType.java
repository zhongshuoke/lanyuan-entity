package com.lanyuan.entity;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.lanyuan.util.ExcelDataMapper;
import com.lanyuan.util.JsonDateSerializer;

/**
 * 微信公众号类别实体表
 */
@SuppressWarnings("serial")
public class WxAccType implements java.io.Serializable{
	
	private int id;

	/*微信公众号类别*/ 
	//譬如 新闻 娱乐 养生
	private String wxType;
	
	/*微信公众号类别缩写*/
	//譬如 xinwen yule yangsheng
	private String wxTypeSN;
	
	/*创建时间*/
    private Date createTime;

    @ExcelDataMapper(title="id",order=1)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ExcelDataMapper(title="微信公众号类别",order=2)
	public String getWxType() {
		return wxType;
	}

	public void setWxType(String wxType) {
		this.wxType = wxType;
	}

	@ExcelDataMapper(title="微信公众号类别缩写",order=3)
	public String getWxTypeSN() {
		return wxTypeSN;
	}

	public void setWxTypeSN(String wxTypeSN) {
		this.wxTypeSN = wxTypeSN;
	}

	@ExcelDataMapper(title="创建时间",order=4)
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
