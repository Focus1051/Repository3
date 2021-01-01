package com.luca.lianxi.entity;

/**
 * 内容属性实体类
 * 
 * @author my
 *
 */
public class ContentAttributes {

	private Integer id;

	private Integer isTop;// 置顶

	private Integer isRecommend;// 推荐

	private Integer isHotspot;// 热点

	private Integer isEyeCathing;// 醒目

	private Integer messageId;// 信息id

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIsTop() {
		return isTop;
	}

	public void setIsTop(Integer isTop) {
		this.isTop = isTop;
	}

	public Integer getIsRecommend() {
		return isRecommend;
	}

	public void setIsRecommend(Integer isRecommend) {
		this.isRecommend = isRecommend;
	}

	public Integer getIsHotspot() {
		return isHotspot;
	}

	public void setIsHotspot(Integer isHotspot) {
		this.isHotspot = isHotspot;
	}

	public Integer getIsEyeCathing() {
		return isEyeCathing;
	}

	public void setIsEyeCathing(Integer isEyeCathing) {
		this.isEyeCathing = isEyeCathing;
	}

	public Integer getMessageId() {
		return messageId;
	}

	public ContentAttributes(Integer isTop, Integer isRecommend, Integer isHotspot, Integer isEyeCathing,
			Integer messageId) {
		super();
		this.isTop = isTop;
		this.isRecommend = isRecommend;
		this.isHotspot = isHotspot;
		this.isEyeCathing = isEyeCathing;
		this.messageId = messageId;
	}

	public ContentAttributes() {
		super();
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

}
