package com.railway.railwayecsystem.util;

import net.sf.json.JsonConfig;

import java.security.Timestamp;
import java.util.Date;

public class Config {

	public static JsonConfig jsonConfig = new JsonConfig();
	public static JsonConfig jsonConfig2 = new JsonConfig();
	public static JsonConfig jsonConfig3 = new JsonConfig();
	public static JsonConfig jsonConfig4 = new JsonConfig();
	public static JsonConfig jsonConfig5 = new JsonConfig();
	public static JsonConfig jsonConfig6 = new JsonConfig();
	static{
		jsonConfig.registerJsonValueProcessor(Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm:ss"));
		jsonConfig.registerJsonValueProcessor(Long.class, new LongJsonValueProcessor());
		jsonConfig.registerJsonValueProcessor(Double.class, new DoubleJsonValueProcessor());
		jsonConfig2.registerJsonValueProcessor(Date.class, new DateJsonValueProcessor("yyyy-MM-dd"));
		jsonConfig2.registerJsonValueProcessor(Long.class, new LongJsonValueProcessor());
		jsonConfig2.registerJsonValueProcessor(Double.class, new DoubleJsonValueProcessor());
		jsonConfig3.registerJsonValueProcessor(Date.class, new DateJsonValueProcessor("yyyy-MM-dd"));
		jsonConfig3.registerJsonValueProcessor(Long.class, new LongJsonValueProcessor3());
		jsonConfig3.registerJsonValueProcessor(Integer.class, new IntegerJsonValueProcessor3());
		jsonConfig3.registerJsonValueProcessor(Double.class, new DoubleJsonValueProcessor());
		jsonConfig4.registerJsonValueProcessor(Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm:ss"));
		jsonConfig4.registerJsonValueProcessor(Long.class, new LongJsonValueProcessor3());
		jsonConfig4.registerJsonValueProcessor(Integer.class, new IntegerJsonValueProcessor3());
		jsonConfig4.registerJsonValueProcessor(Double.class, new DoubleJsonValueProcessor());
		jsonConfig5.registerJsonValueProcessor(Date.class, new DateJsonValueProcessor("yyyy-MM-dd"));
		jsonConfig5.registerJsonValueProcessor(Long.class, new LongJsonValueProcessor3());
		jsonConfig5.registerJsonValueProcessor(Integer.class, new IntegerJsonValueProcessor3());
		jsonConfig6.registerJsonValueProcessor(Date.class, new DateJsonValueProcessor("yyyy-MM-dd"));
		jsonConfig6.registerJsonValueProcessor(Long.class, new LongJsonValueProcessor3());
		jsonConfig6.registerJsonValueProcessor(Integer.class, new IntegerJsonValueProcessor3());
		jsonConfig6.registerJsonValueProcessor(Double.class, new DoubleJsonValueProcessor());
		jsonConfig6.registerJsonValueProcessor(Timestamp.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm:ss"));
	}
	
}
