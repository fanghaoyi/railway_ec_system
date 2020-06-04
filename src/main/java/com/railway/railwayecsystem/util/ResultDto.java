package com.railway.railwayecsystem.util;

import java.io.Serializable;

/**
 * create :fanghaoyi
 * date: 2020/6/4
 * describe: 描述
 */
public class ResultDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer code;

	private Object content;

	private String message;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
