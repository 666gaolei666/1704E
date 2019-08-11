package com.bw.gaolei.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @作者 高蕾
 *
 * 2019年8月10日
 */
public class DateUtil {
	public static Date stringToDate(String src,String patterem){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		try {
			return sdf.parse(src);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
