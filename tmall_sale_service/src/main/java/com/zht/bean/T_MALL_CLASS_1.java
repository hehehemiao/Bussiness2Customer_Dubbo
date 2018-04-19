package com.zht.bean;

import java.io.Serializable;

//分类1表
public class T_MALL_CLASS_1 implements Serializable{

	private int id;
	private String flmch1;//分类名称1

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlmch1() {
		return flmch1;
	}

	public void setFlmch1(String flmch1) {
		this.flmch1 = flmch1;
	}

}
