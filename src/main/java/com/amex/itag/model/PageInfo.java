package com.amex.itag.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class PageInfo {

	private String pageId;

	private String country;

	private String language;

	private String pageName;

	private String businessUnit;

	private String businessCategory;
	
	private String totalJson;

	public PageInfo() {
	}

	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getBusinessCategory() {
		return businessCategory;
	}

	public void setBusinessCategory(String businessCategory) {
		this.businessCategory = businessCategory;
	}
	public String getTotalJson() {
		return totalJson;
	}

	public void setTotalJson(String totalJson) {
		this.totalJson = totalJson;
	}

}
