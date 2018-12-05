package com.dis.serve.po;

public class Policy {
	private int pid;
	private String polname;
	private String polcontent;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPolname() {
		return polname;
	}
	public void setPolname(String polname) {
		this.polname = polname;
	}
	public String getPolcontent() {
		return polcontent;
	}
	public void setPolcontent(String polcontent) {
		this.polcontent = polcontent;
	}
	@Override
	public String toString() {
		return "Policy [pid=" + pid + ", polname=" + polname + ", polcontent=" + polcontent + "]";
	}
	

}
