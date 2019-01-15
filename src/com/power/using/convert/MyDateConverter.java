package com.power.using.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class MyDateConverter extends StrutsTypeConverter {

	private SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");;

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		if (toClass != Date.class) {
			throw new IllegalArgumentException("不是日期类型,请选择别的转换器");
		}
		if (values == null || values.length == 0) {
			throw new IllegalArgumentException("没有数据");
		}
		String sDate = values[0];
		if (!sDate.trim().equals("")) {

			try {
				return df.parse(sDate);
			} catch (ParseException e) {
				throw new RuntimeException(e);
			}
		}

		return null;
	}

	@Override
	public String convertToString(Map context, Object o) {
			
		if(!(o instanceof Date)){
			throw new IllegalArgumentException("不是日期类型,请选择别的转换器");
		}
		
		Date date=(Date) o;
		return df.format(date);
	}

}
