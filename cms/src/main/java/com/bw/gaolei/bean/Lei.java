package com.bw.gaolei.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * @作者 高蕾
 *
 * 2019年8月6日
 */
public class Lei {
	private int lid;
	private String lname;
	private Set<Zhi> zhi = new HashSet<Zhi>();
	
	public Lei(int lid, String lname, Set<Zhi> zhi) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.zhi = zhi;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Set<Zhi> getZhi() {
		return zhi;
	}
	public void setZhi(Set<Zhi> zhi) {
		this.zhi = zhi;
	}
	@Override
	public String toString() {
		return "Lei [lid=" + lid + ", lname=" + lname + ", zhi=" + zhi + "]";
	}
	public Lei() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
