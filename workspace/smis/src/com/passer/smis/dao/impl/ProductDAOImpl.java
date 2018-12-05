package com.passer.smis.dao.impl;

import java.util.List;

import com.passer.smis.dao.IProductDAO;
import com.passer.smis.domain.Product;
import com.passer.smis.handler.impl.BeanHandler;
import com.passer.smis.handler.impl.BeanListHandler;
import com.passer.smis.template.JdbcTemplate;

public class ProductDAOImpl implements IProductDAO{

	public void delete(String productName) {
		String sql = "DELETE FROM product WHERE productName = ?";
		JdbcTemplate.update(sql, productName);
	}

	public void save(Product product) {
		String sql = "INSERT INTO product (productName,costPrice,salePrice,supplier,unit) VALUES(?,?,?,?,?)";
		JdbcTemplate.update(sql, product.getProductName(),
				product.getCostPrice(),product.getSalePrice(),product.getSupplier(),product.getUnit());
	}

	public List<Product> getAllList() {
		String sql = "SELECT * FROM product";
		return JdbcTemplate.query(sql, new BeanListHandler<>(Product.class));
	}

	public Product getProduct(String productName) {
		String sql = "SELECT * FROM product WHERE productName = ?";
		return JdbcTemplate.query(sql, new BeanHandler<>(Product.class), productName);
	}

	public boolean updateStockNum(String productName, Integer number, boolean isSale) {
		if(isSale) {
			Product product = getProduct(productName);
			Integer stockNum = product.getStockNum();
			if(stockNum >= number) {
				String sql = "UPDATE product SET stockNum = stockNum-? WHERE productName=?";
				JdbcTemplate.update(sql, number,productName);
			}else {
				return false;
			}
		}
		else {
			String sql = "UPDATE product SET stockNum = stockNum+? WHERE productName=?";
			JdbcTemplate.update(sql, number,productName);
		}
		return true;
	}
}
