package com.passer.mybatis.hello.query;

import java.util.List;

import lombok.Data;

@Data
public class PageResult {
	private List<?> resultList; //查询结果
	
	private Integer totalCount; //记录总条数
	
	private Integer pageSize = 3; //每页显示数据条数，默认为3
	
	private Integer currentPage = 1; //当前页,默认为第一页
	
	private Integer prevPage; //当前页的上一页，如果没有上一页,即为第一页
	
	private Integer nextPage; //当前页的下一页，如果没有下一页，即为最后一页
	
	private Integer totalPage; //总页数，需要根据totalCount和pageSize计算
	
	public PageResult() {}

	public PageResult(List<?> resultList, Integer totalCount, Integer pageSize, Integer currentPage) {
		
		this.resultList = resultList;
		this.totalCount = totalCount;
		this.pageSize = pageSize;
		this.currentPage = currentPage;
		
		totalPage = totalCount % pageSize == 0 ? totalCount/pageSize : totalCount/pageSize+1;
		prevPage = currentPage > 1 ? currentPage - 1 : currentPage;
		nextPage = currentPage < totalCount ? currentPage + 1 :currentPage;
	}
	
	
}
