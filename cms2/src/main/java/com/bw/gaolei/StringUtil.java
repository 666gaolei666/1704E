package com.bw.gaolei;

/**
 * @作者 高蕾
 *
 * 2019年8月9日
 */
public class StringUtil {
	//方法1,判断源字符串是否为空,空引号(空白字符创 )也算没值
	 public boolean hasLength(String src){
		  if(!src.equals("")&&src != null){
			  return false;
		  }else{
			  return true; 
		  }
	 }
	 
	 //方法二:判断源字符串是否有值,空引号(空白字符串)和空格也算没值
	 public boolean hasText(String src){
		if(!src.equals(" ")&&src != null && !src.equals("")){
			return false;
		}
		return true;
	 }
	 
	 //方法三:判断是否为手机号码
	 public boolean isMobile(String src){
		 String regex = "^1([38]\\d|5[0-35-9]|7[3678])\\d{8}$";
		 return src.matches(regex);
	 }
	 
	 //方法四:判断是否是邮箱
	 public boolean isEmail(String src){
		 String regex = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";
		 return src.matches(regex);
	 }
	 
	 //方法五:反转字符串,例如参数值是"abcdefg",则输出"gfedcba"
	 public String reverse(String src){
		 return new StringBuffer(src).reverse().toString();
	 }
}
