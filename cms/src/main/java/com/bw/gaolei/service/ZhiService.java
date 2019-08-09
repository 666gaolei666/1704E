package com.bw.gaolei.service;

import java.util.List;

import com.bw.gaolei.bean.Lei;
import com.bw.gaolei.bean.Zhi;
import com.bw.gaolei.bean.ZhiVo;

/**
 * @作者 高蕾
 *
 * 2019年8月6日
 */
public interface ZhiService {
	//删除
	int del(int zid);
	//批量删除
	int pldel(ZhiVo z);
	//修改
	int update(Zhi z);
	//回显
	Zhi listzhiid(int zid);
	//添加
	int add(Zhi z);
	//下拉框
	List<Lei> listlei();
	//列表展示
	List<Zhi> listzhi(ZhiVo zv);
}
