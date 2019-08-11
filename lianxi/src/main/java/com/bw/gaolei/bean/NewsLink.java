package com.bw.gaolei.bean;

import java.util.Date;

/**
 * @作者 高蕾
 *
 * 2019年8月10日
 */
public class NewsLink {
	private int id;
	private int score;
	private Date created;
	public NewsLink(int id, int score, Date created) {
		super();
		this.id = id;
		this.score = score;
		this.created = created;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	@Override
	public String toString() {
		return "NewsLink [id=" + id + ", score=" + score + ", created=" + created + "]";
	}
	public NewsLink() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
