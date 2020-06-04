package com.railway.railwayecsystem.dto;

import java.io.Serializable;
import java.util.List;

/**
 * create :fanghaoyi
 * date: 2020/6/4
 * describe: 描述
 */
public class FunctionParent implements Serializable {

	private static final long serialVersionUID = 1L;

	private String parentName;

	private String parentUrl;

	private List<Function> functionList;

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getParentUrl() {
		return parentUrl;
	}

	public void setParentUrl(String parentUrl) {
		this.parentUrl = parentUrl;
	}

	public List<Function> getFunctionList() {
		return functionList;
	}

	public void setFunctionList(List<Function> functionList) {
		this.functionList = functionList;
	}
}
