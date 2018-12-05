package com.dis.serve.po;

public class Picture {
	private int pid;
	private String picname;
	private String picaddress;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPicname() {
		return picname;
	}
	public void setPicname(String picname) {
		this.picname = picname;
	}
	public String getPicaddress() {
		return picaddress;
	}
	public void setPicaddress(String picaddress) {
		this.picaddress = picaddress;
	}
	@Override
	public String toString() {
		return "Picture [pid=" + pid + ", picname=" + picname + ", picaddress=" + picaddress + "]";
	}

}
