package com.bw.gaolei.Test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.gaolei.bean.NewsLink;
import com.bw.gaolei.mapper.NewsLinkMapper;
import com.bw.gaolei.util.CommonUtil;
import com.bw.gaolei.util.DateUtil;

/**
 * @作者 高蕾
 *
 * 2019年8月10日
 */
public class Test1 {
	@Test
	public void add(){
		String url = "http://news.cnstock.com/news,yw-2019/08/10-4413224.htm";
		String[] result = url.split("-");
		String time = result[1];
		int score = CommonUtil.getPlaceHolder(result[2], "[^0-9]");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		NewsLinkMapper newsLinkMapper = context.getBean(NewsLinkMapper.class);
		NewsLink newlink = new NewsLink();
		newlink.setScore(score);
		newlink.setCreated(DateUtil.stringToDate(time,"yyyy/MM/dd"));
		newsLinkMapper.add(newlink);
	}
}
