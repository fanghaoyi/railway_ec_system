package com.railway.railwayecsystem.dto;

import java.io.Serializable;

/**
 * create :fanghaoyi
 * date: 2020/6/4
 * describe: 描述
 */
public class Function implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	private String url;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
