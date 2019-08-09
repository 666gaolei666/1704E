package com.bw.gaolei.bean;

/**
 * @作者 高蕾
 *
 * 2019年8月6日
 */
public class Zhi {
	private int zid;
	private String zname;
	private String zmiao;
	private Lei lei;
	
	public int getZid() {
		return zid;
	}
	public void setZid(int zid) {
		this.zid = zid;
	}
	public String getZname() {
		return zname;
	}
	public void setZname(String zname) {
		this.zname = zname;
	}
	public String getZmiao() {
		return zmiao;
	}
	public void setZmiao(String zmiao) {
		this.zmiao = zmiao;
	}
	public Lei getLei() {
		return lei;
	}
	public void setLei(Lei lei) {
		this.lei = lei;
	}
	@Override
	public String toString() {
		return "Zhi [zid=" + zid + ", zname=" + zname + ", zmiao=" + zmiao + ", lei=" + lei + "]";
	}
	public Zhi() {
		super();
		// TODO Auto-generated constructor stub
	}
}
