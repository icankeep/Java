package com.passer.smis.dao;

import java.util.List;

import com.passer.smis.domain.Product;

/**
 * Product的dao操作类，定义了保存，删除，查询规范
 * @author passer
 *
 */
public interface IProductDAO {

	/**
	 * 删除指定名称的产品
	 * @param productName	要删除的产品名称
	 */
	void delete(String productName);
	
	/**
	 * 保存产品
	 * @param product	要保存的产品
	 */
	void save(Product product);
	
	/**
	 *	查询所有产品
	 * @return	返回所有产品的List集合
	 */
	List<Product> getAllList();
	
	/**
	 * 根据产品名称查询产品其他信息
	 * @param productName	 需要查询产品信息的产品名称
	 * @return				返回查询到的产品对象
	 */
	Product getProduct(String productName);
	
	/**
	 * 修改产品库存数量
	 * @param productName	需要修改数量的产品名称
	 * @param number		需要修改的增加或减少的产品数量
	 * @param isSale		为true的话为销货状态，为false是进货状态，决定数量增减
	 * @return 				销货时如果库存小于销出数量，则返回false，否则返回true
	 */
	boolean updateStockNum(String productName,Integer number,boolean isSale);
}
