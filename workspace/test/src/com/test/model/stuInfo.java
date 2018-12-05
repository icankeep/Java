package com.test.model;

public class stuInfo {
	private long id;
	private String name;
	private int sex;
	private String birth;
	private String[] course={ "" }; 
	private String courses="";
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String[] getCourse() {
		return course;
	}
	public void setCourse(String[] course) {
		this.course = course;
	}
	public String getCourses() {
		if (course!=null)
		{
			for(int i=0;i<course.length;i++)
				courses+=course[i]+"&";
		
		}
		courses=courses.substring(0,courses.length()-1);
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	
}
