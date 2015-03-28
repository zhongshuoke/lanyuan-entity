package com.lanyuan.entity;

/**
 * 类别图片实体类
 * @author caokun
 *
 */
public class TypePic {

    //类别图片的id
	private int id;
	
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
}
