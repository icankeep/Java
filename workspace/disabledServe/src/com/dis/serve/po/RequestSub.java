package com.dis.serve.po;

public class RequestSub {
     private int rid;
     private String username;
     private String mobile;
     private String sex;
     private String kind;
     private String content;
     
	public RequestSub() {
		super();
	}
	public RequestSub(String username, String mobile, String sex, String kind, String content) {
		super();
		this.username = username;
		this.mobile = mobile;
		this.sex = sex;
		this.kind = kind;
		this.content = content;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "RequestSub [rid=" + rid + ", username=" + username + ", mobile=" + mobile + ", sex=" + sex + ", kind="
				+ kind + ", content=" + content + "]";
	}

}
