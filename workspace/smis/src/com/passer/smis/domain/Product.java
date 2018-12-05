package com.passer.smis.domain;

import java.math.BigDecimal;

import lombok.Data;

/**
 * 产品类，封装了产品的信息<p>
 * @author passer
 *
 */
@Data
public class Product {
	
	/**
	 * 产品id
	 */
	private Long id;
	/**
	 * 产品名称
	 */
	private String productName;
	
	/**
	 * 产品每单位进货价格
	 */
	private BigDecimal costPrice;
	
	/**
	 * 产品每单位销售价格
	 */
	private BigDecimal salePrice;
	
	/**
	 * 产品供应商
	 */
	private String supplier;
	
	/**
	 * 产品单位
	 */
	private String unit;
	
	/**
	 * 产品库存数量
	 */
	private Integer stockNum;
}
