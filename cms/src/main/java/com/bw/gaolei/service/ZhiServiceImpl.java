package com.bw.gaolei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bw.gaolei.bean.Lei;
import com.bw.gaolei.bean.Zhi;
import com.bw.gaolei.bean.ZhiVo;
import com.bw.gaolei.mapper.ZhiMapper;

/**
 * @作者 高蕾
 *
 * 2019年8月6日
 */
@Service
@Transactional
public class ZhiServiceImpl implements ZhiService{
	@Autowired
	private ZhiMapper zm;

	//列表展示
	public List<Zhi> listzhi(ZhiVo zv) {
		return zm.listzhi(zv);
	}

	//下拉框
	public List<Lei> listlei() {
		return zm.listlei();
	}

	//添加
	public int add(Zhi z) {
		return zm.add(z);
	}

	//回显
	public Zhi listzhiid(int zid) {
		return zm.listzhiid(zid);
	}

	//修改
	public int update(Zhi z) {
		return zm.update(z);
	}

	//批量删除
	public int pldel(ZhiVo z) {
		return zm.pldel(z);
	}

	//删除
	public int del(int zid) {
		return zm.del(zid);
	}
}
