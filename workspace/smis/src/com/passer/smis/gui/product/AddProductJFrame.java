package com.passer.smis.gui.product;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.passer.smis.dao.IProductDAO;
import com.passer.smis.dao.impl.ProductDAOImpl;
import com.passer.smis.domain.Product;

public class AddProductJFrame extends JFrame {

	private  JPanel contentPane;
	private  JTextField productNameTextField;
	private  JTextField costPriceTextField;
	private  JTextField salePriceTextField;
	private  JTextField supplierTextField;
	private  JTextField unitTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProductJFrame frame = new AddProductJFrame();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddProductJFrame() {
		setTitle("添加产品");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(350, 200, 440, 272);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel productNameLabel = new JLabel("名   称：");
		productNameLabel.setBounds(36, 45, 73, 15);
		contentPane.add(productNameLabel);
		
		JLabel costPriceLabel = new JLabel("进货价格：");
		costPriceLabel.setBounds(36, 70, 73, 15);
		contentPane.add(costPriceLabel);
		
		JLabel supplierLabel = new JLabel("供货商：");
		supplierLabel.setBounds(36, 130, 73, 15);
		contentPane.add(supplierLabel);
		
		JLabel salePriceLabel = new JLabel("销售价格：");
		salePriceLabel.setBounds(36, 105, 84, 15);
		contentPane.add(salePriceLabel);
		
		JLabel unitLabel = new JLabel("单位：");
		unitLabel.setBounds(212, 73, 54, 15);
		contentPane.add(unitLabel);
		
		productNameTextField = new JTextField();
		productNameTextField.setBounds(96, 42, 99, 21);
		contentPane.add(productNameTextField);
		productNameTextField.setColumns(10);
		
		costPriceTextField = new JTextField();
		costPriceTextField.setBounds(96, 70, 99, 21);
		contentPane.add(costPriceTextField);
		costPriceTextField.setColumns(10);
		
		salePriceTextField = new JTextField();
		salePriceTextField.setBounds(96, 99, 99, 21);
		contentPane.add(salePriceTextField);
		salePriceTextField.setColumns(10);
		
		supplierTextField = new JTextField();
		supplierTextField.setBounds(96, 127, 99, 21);
		contentPane.add(supplierTextField);
		supplierTextField.setColumns(10);
		
		unitTextField = new JTextField();
		unitTextField.setBounds(249, 70, 37, 21);
		contentPane.add(unitTextField);
		unitTextField.setColumns(10);
		
		JButton clearButton = new JButton("clear");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		clearButton.setBounds(312, 178, 93, 23);
		contentPane.add(clearButton);
		
		JButton submitButton = new JButton("submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Product product = new Product();
				IProductDAO productDAO = new ProductDAOImpl();
				product.setProductName(productNameTextField.getText());
				product.setCostPrice(new BigDecimal(costPriceTextField.getText()));
				product.setSalePrice(new BigDecimal(salePriceTextField.getText()));
				product.setSupplier(supplierTextField.getText());
				product.setUnit(unitTextField.getText());
				productDAO.save(product);
				dispose();
			}
		});
		submitButton.setBounds(199, 178, 93, 23);
		contentPane.add(submitButton);
		
		setVisible(true);
	}
}
