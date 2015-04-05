package com.lanyuan.entity;

/**
 * 类别（栏目）图片实体类
 * @author caokun
 *
 */
public class TypePic {

    //类别图片的id
	private int id;
	
	//栏目id
	private Long wxAccTypeId;
	
	//微信文章id
	private Long wxArticleId;
	
    //微信文章标题
	private String wxArticTitle;
	
    //类别图片的服务器地址
	private String typePicUrl;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypePicUrl() {
		return typePicUrl;
	}

	public void setTypePicUrl(String typePicUrl) {
		this.typePicUrl = typePicUrl;
	}

	public Long getWxArticleId() {
		return wxArticleId;
	}

	public void setWxArticleId(Long wxArticleId) {
		this.wxArticleId = wxArticleId;
	}

	public Long getWxAccTypeId() {
		return wxAccTypeId;
	}

	public void setWxAccTypeId(Long wxAccTypeId) {
		this.wxAccTypeId = wxAccTypeId;
	}

	public String getWxArticTitle() {
		return wxArticTitle;
	}

	public void setWxArticTitle(String wxArticTitle) {
		this.wxArticTitle = wxArticTitle;
	}
	
}
