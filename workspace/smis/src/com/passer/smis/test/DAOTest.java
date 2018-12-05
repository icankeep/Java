package com.passer.smis.test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import com.passer.smis.dao.IProductDAO;
import com.passer.smis.dao.IUserDAO;
import com.passer.smis.dao.impl.ProductDAOImpl;
import com.passer.smis.dao.impl.UserDAOImpl;
import com.passer.smis.domain.Product;

public class DAOTest {

	private IUserDAO userDAO = new UserDAOImpl();
	private IProductDAO productDAO = new ProductDAOImpl();
	@Test
	void testUserDAO() {
		System.out.println(userDAO.getPasswordByUsername("passer"));
	}
	
	@Test
	void testProductDAOSave() throws Exception {
		Product product = new Product ();
		product.setProductName("apple");
		product.setCostPrice(new BigDecimal("4"));
		product.setSalePrice(new BigDecimal("6"));
		product.setSupplier("@passer");
		product.setUnit("yuan");
		
		productDAO.save(product);
	}

	@Test
	void testDelete() throws Exception {
		productDAO.delete("apple");
	}
	
	@Test
	void testList() throws Exception {
		for (Product product : productDAO.getAllList()) {
			System.out.println(product);
		}
	}
	
	@Test
	void testGet() throws Exception {
		System.out.println(productDAO.getProduct("apple"));
	}
}
