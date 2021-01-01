package com.luca.lianxi.entity;

/**
 * @author my
 *
 */
public class Image {
	 
	private Integer id;
	
	private String path;//路径
	
	private String tableName;//表名
	
	private Integer tableId;//表中行id
	
	private String description;//图片描述
	
	private String imageType;//图片类型

	public Integer getId() {
		return id;
	}

	public Image(String path, String tableName, Integer tableId, String description, String imageType) {
		this.path = path;
		this.tableName = tableName;
		this.tableId = tableId;
		this.description = description;
		this.imageType = imageType;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Integer getTableId() {
		return tableId;
	}

	public void setTableId(Integer tableId) {
		this.tableId = tableId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageType() {
		return imageType;
	}

	public Image() {
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

}
