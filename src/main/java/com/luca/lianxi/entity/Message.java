package com.luca.lianxi.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Message {
    @ApiModelProperty(value="招聘唯一标示")
	@ExcelProperty("标号")
	private Integer id;

    @ApiModelProperty(value = "招聘标题")
    @ExcelProperty("标题")
	// 标题
	private String title;

	// 详细信息
	@ExcelProperty("详细信息")
	private String content;

	// 添加日期
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ExcelProperty("日期")
	private Date time;

	// 副标题
	@ExcelProperty("副标题")
	private String viceTitle;

	// 内容摘要
	@ExcelProperty("内容摘要")
	private String contentAbstract;

	// 作者
	@ExcelProperty("作者")
	private String author;

	// 来源
	@ExcelProperty("来源")
	private String source;
	// 内容标签
	@ExcelProperty("内容标签")
	private String contentLabel;

	// 信息类型
	@ExcelProperty("信息类型")
	private Integer messageType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getViceTitle() {
		return viceTitle;
	}

	public void setViceTitle(String viceTitle) {
		this.viceTitle = viceTitle;
	}

	public String getContentAbstract() {
		return contentAbstract;
	}

	public void setContentAbstract(String contentAbstract) {
		this.contentAbstract = contentAbstract;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getContentLabel() {
		return contentLabel;
	}

	public void setContentLabel(String contentLabel) {
		this.contentLabel = contentLabel;
	}

	public Integer getMessageType() {
		return messageType;
	}

	public void setMessageType(Integer messageType) {
		this.messageType = messageType;
	}


	

}
