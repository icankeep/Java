package com.passer.mybatis.hello.query;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class UserObjectQuery {
	
	private String keyword; //关键词，筛选出sn,name中存在该关键词的User
	
	private BigDecimal minSalary; //最低工资
	
	private BigDecimal maxSalary; //最高工资
	
	private Long deptid=-1L;	//部门id，默认为-1即全部部门
	
	private Integer currentPage; //跳转到哪一页
		
	private Integer pageSize;	//每页显示数据条数
	
	public Integer getStart() {
		return (currentPage-1)*pageSize;
	}
}
