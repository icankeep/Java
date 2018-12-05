package com.dis.serve.po;

public class Commend {
	private int cid;
	private String comname;
	private String comcontent;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getComname() {
		return comname;
	}
	public void setComname(String comname) {
		this.comname = comname;
	}
	public String getComcontent() {
		return comcontent;
	}
	public void setComcontent(String comcontent) {
		this.comcontent = comcontent;
	}
	@Override
	public String toString() {
		return "Commend [cid=" + cid + ", comname=" + comname + ", comcontent=" + comcontent + "]";
	}
		

}
