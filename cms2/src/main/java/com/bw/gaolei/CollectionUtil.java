package com.bw.gaolei;

import java.util.List;
import java.util.Map;

/**
 * @作者 高蕾
 *
 * 2019年8月9日
 */
public class CollectionUtil {
	//方法一:判断List或Set集合是否有元素,对象为空或对象中没有元素都算没值
	public boolean notEmpty(List<String> list){
		if(list!=null){
			return list.size()==0;
		}
		return false;
	}
	
	//方法二.判断Map集合是否有元素,对象为空或对象中没有都算没值
	public boolean notEmoty(Map<String,String> map){
		return map.isEmpty();
	}
}
