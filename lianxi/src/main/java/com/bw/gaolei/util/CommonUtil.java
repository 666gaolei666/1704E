package com.bw.gaolei.util;

import java.util.regex.Pattern;

/**
 * @作者 高蕾
 *
 * 2019年8月10日
 */
public class CommonUtil {
	//判断字符串是否为数字
	public static boolean isNumber(String src){
		return Pattern.compile("\\d+").matcher(src).matches();
	}
	
	//判断源字符串是否有空值,空引号(空白字符串)和空格也算没值
	public static boolean hasText(String src){
		if(!src.equals(" ") || src != null || !src.equals("")){
			return true;
		}
		return false;
	}
	
	//根据url地址取出地址中的数字
	public static int getPlaceHolder(String url,String regex){
		String score = Pattern.compile(regex).matcher(url).replaceAll("");
		return hasText(score) ? Integer.parseInt(score):0;
	}
}
