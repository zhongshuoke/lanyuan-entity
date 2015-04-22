/**
 * 
 */
package com.lanyuan.entity;

/**
 * @author Administrator
 *
 */
public enum OperateTypeEnum {
    // 枚举列表必须写在最前面，否则编译出错
	collectionArticle, likeButton, subscribeKeyword, subscribeClass, increaseReadNum;
	
	public static boolean isOperateType(String operateType) {
		for(OperateTypeEnum item : OperateTypeEnum.values()) {
			if(item.name().equals(operateType)) {
				return true;	
			}
		}
		return false;
	}
}
