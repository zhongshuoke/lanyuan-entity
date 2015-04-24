package com.lanyuan.entity;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.lanyuan.util.JsonDateSerializer;

/**
 * 微信公众号文章实体表
 */
@SuppressWarnings("serial")
public class WxArticle implements java.io.Serializable{
	
	/*微信文章Id*/
	private int id;
	/*微信公众号*/
	private String wxAccountNo;
	/*微信文章标题*/
	private String title;
	/*微信文章内容*/
	private String content;
	/*微信文章发布时间*/
	private Date publishTime;
	/*微信文章抓取时间*/
	private Date captureTime;
	/*微信文章源链接*/
	private String sourceUrl;
	/*微信阅读数*/
	private Integer readNum;
	/*微信点赞数*/
	private Integer goodNum;
	/*文章对应缩略图所在服务器地址*/
	private String picUrl;
	/*文章是否已被推荐   1为已推荐，0为未推荐*/
	private int isRecomm;
	private String isRecommDesc;

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

	public Integer getReadNum() {
		if(readNum==null) {
			return 0;
		}else {
			return readNum;
		}
	}

	public void setReadNum(Integer readNum) {
		this.readNum = readNum;
	}

	public Integer getGoodNum() {
		if(goodNum==null) {
			return 0;
		}else {
			return goodNum;
		}
	}

	public void setGoodNum(Integer goodNum) {
		this.goodNum = goodNum;
	}

	public String getPicUrl() {
		return this.picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	@Override
	public String toString() {
		return "WxArticle [id=" + id + ", wxAccountNo=" + wxAccountNo
				+ ", title=" + title + ", content=" + content
				+ ", publishTime=" + publishTime + ", captureTime="
				+ captureTime + ", sourceUrl=" + sourceUrl + ", readNum="
				+ readNum + ", goodNum=" + goodNum + ", picUrl=" + picUrl + "]";
	}

	

	public String getIsRecommDesc() {
		if(this.isRecomm == 0){
			return "未推荐";
		}else{
			return "<span style='color:red'>已推荐</span>";
		}
	}

	public void setIsRecommDesc(String isRecommDesc) {
		this.isRecommDesc = isRecommDesc;
	}

	public int getIsRecomm() {
		return isRecomm;
	}

	public void setIsRecomm(int isRecomm) {
		this.isRecomm = isRecomm;
	}

	
	
}
