package com.lgy.springex_6_3;

import java.util.ArrayList;

public class Singer {
	String name;
	String member;
	ArrayList<String> song;
	
	public Singer(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public ArrayList<String> getSong() {
		return song;
	}
	public void setSong(ArrayList<String> song) {
		this.song = song;
	}
	
	
}
