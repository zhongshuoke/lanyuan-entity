package com.lanyuan.entity;


import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.lanyuan.util.ExcelDataMapper;
import com.lanyuan.util.JsonDateSerializer;

/**
 * 众说客今日推荐实体表
 */
@SuppressWarnings("serial")
public class WxRecommendToday implements java.io.Serializable{
	
	/*微信文章Id*/
	private int id;
	/*微信公众号*/
	private String wxAccountNo;
	/*微信文章标题*/
	private String title;
	/*微信文章概要*/
	private String str_abstract;
	/*微信文章内容*/
	private String content;
	/*微信文章发布时间*/
	private Date publishTime;
	/*微信文章抓取时间*/
	private Date captureTime;
	/*微信文章源链接*/
	private String sourceUrl;
	/*阅读数*/
	private int readNum;
	/*点赞数*/
	private int goodNum;
	/*缩略图的存储地址*/
	private String picUrl;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getWxAccountNo() {
		return wxAccountNo;
	}
	
	public void setWxAccountNo(String wxAccountNo) {
		this.wxAccountNo = wxAccountNo;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	/*时间格式化*/
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getPublishTime() {
		return publishTime;
	}
	
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	
	/*时间格式化*/
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getCaptureTime() {
		return captureTime;
	}
	
	public void setCaptureTime(Date captureTime) {
		this.captureTime = captureTime;
	}
	
	public String getSourceUrl() {
		return sourceUrl;
	}
	
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public String getPicUrl() {
        return this.picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public int getReadNum() {
		return readNum;
	}

	public void setReadNum(int readNum) {
		this.readNum = readNum;
	}

	public int getGoodNum() {
		return goodNum;
	}

	public void setGoodNum(int goodNum) {
		this.goodNum = goodNum;
	}

	public String getStr_abstract() {
		return str_abstract;
	}

	public void setStr_abstract(String str_abstract) {
		this.str_abstract = str_abstract;
	}

	@Override
	public String toString() {
		return "WxRecommendToday [id=" + id + ", wxAccountNo=" + wxAccountNo
				+ ", title=" + title + ", str_abstract=" + str_abstract
				+ ", content=" + content + ", publishTime=" + publishTime
				+ ", captureTime=" + captureTime + ", sourceUrl=" + sourceUrl
				+ ", readNum=" + readNum + ", goodNum=" + goodNum + ", picUrl="
				+ picUrl + "]";
	}

}
