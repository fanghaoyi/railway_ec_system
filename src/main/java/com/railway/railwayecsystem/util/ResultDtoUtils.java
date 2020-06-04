package com.railway.railwayecsystem.util;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 * create :fanghaoyi
 * date: 2020/6/4
 * describe: 描述
 */
public class ResultDtoUtils {

	public static String returnSuccess(Integer code, String msg, Object content, JsonConfig jsonConfig){
		ResultDto ResultDto=new ResultDto();
		ResultDto.setCode(code);
		ResultDto.setContent(content);
		ResultDto.setMessage(msg);
		JSONObject json  = JSONObject.fromObject(ResultDto,jsonConfig);
		return json.toString();
	}

	public static String returnSuccess(Object content){
		ResultDto ResultDto=new ResultDto();
		ResultDto.setCode(1);
		ResultDto.setContent(content);
		ResultDto.setMessage("success");
		JSONObject json  = JSONObject.fromObject(ResultDto);
		return json.toString();
	}

	public static String returnSuccess(Object content, JsonConfig jsonConfig){
		ResultDto ResultDto=new ResultDto();
		ResultDto.setCode(1);
		ResultDto.setContent(content);
		ResultDto.setMessage("success");
		JSONObject json  = JSONObject.fromObject(ResultDto,jsonConfig);
		return json.toString();
	}

	public static String returnSuccess(Integer code,String msg,Object content){
		ResultDto ResultDto=new ResultDto();
		ResultDto.setCode(code);
		ResultDto.setContent(content);
		ResultDto.setMessage(msg);
		JSONObject json  = JSONObject.fromObject(ResultDto);
		return json.toString();
	}

	public static String returnSuccess(String msg,Object content,JsonConfig jsonConfig){
		ResultDto ResultDto=new ResultDto();
		ResultDto.setCode(1);
		ResultDto.setContent(content);
		ResultDto.setMessage(msg);
		JSONObject json  = JSONObject.fromObject(ResultDto,jsonConfig);
		return json.toString();
	}

	public static String returnSuccess(String msg,Object content){
		ResultDto ResultDto=new ResultDto();
		ResultDto.setCode(1);
		ResultDto.setContent(content);
		ResultDto.setMessage(msg);
		JSONObject json  = JSONObject.fromObject(ResultDto);
		return json.toString();
	}

	public static String returnFeil(Integer code,String msg){
		ResultDto ResultDto=new ResultDto();
		ResultDto.setCode(code);
		ResultDto.setContent(null);
		ResultDto.setMessage(msg);
		JSONObject json  = JSONObject.fromObject(ResultDto);
		return json.toString();
	}

	public static String returnFeil(String msg){
		ResultDto ResultDto=new ResultDto();
		ResultDto.setCode(-1);
		ResultDto.setContent(null);
		ResultDto.setMessage(msg);
		JSONObject json  = JSONObject.fromObject(ResultDto);
		return json.toString();
	}



}
