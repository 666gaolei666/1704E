package com.bw.gaolei.bean;

import java.util.Arrays;

/**
 * @作者 高蕾
 *
 * 2019年8月7日
 */
public class ZhiVo {
	private String name;
	private String[] ids;
	public ZhiVo(String name, String[] ids) {
		super();
		this.name = name;
		this.ids = ids;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getIds() {
		return ids;
	}
	public void setIds(String[] ids) {
		this.ids = ids;
	}
	@Override
	public String toString() {
		return "ZhiVo [name=" + name + ", ids=" + Arrays.toString(ids) + "]";
	}
	public ZhiVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
