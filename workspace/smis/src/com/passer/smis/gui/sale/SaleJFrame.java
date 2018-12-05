package com.passer.smis.gui.sale;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.passer.smis.dao.IProductDAO;
import com.passer.smis.dao.impl.ProductDAOImpl;
import com.passer.smis.domain.Product;

public class SaleJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField numberTextField;
	private JTextField dateTextField;
	private JTextField handleUserTextField;
	private IProductDAO productDAO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaleJFrame frame = new SaleJFrame();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SaleJFrame() {
		productDAO = new ProductDAOImpl();
		List<Product> productList = productDAO.getAllList();
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(350, 200, 421, 245);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<String> productNameComboBox = new JComboBox<>();
		for (Product product : productList) {
			productNameComboBox.addItem(product.getProductName());
		}
		productNameComboBox.setBounds(100, 28, 125, 23);
		contentPane.add(productNameComboBox);
		
		JLabel productNameLabel = new JLabel("名   称：");
		productNameLabel.setBounds(26, 32, 54, 15);
		contentPane.add(productNameLabel);
		
		numberTextField = new JTextField();
		numberTextField.setBounds(100, 61, 66, 21);
		contentPane.add(numberTextField);
		numberTextField.setColumns(10);
		
		JLabel numberLabel = new JLabel("数   量：");
		numberLabel.setBounds(26, 64, 54, 15);
		contentPane.add(numberLabel);
		
		JButton submitButton = new JButton("submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String productName = (String) productNameComboBox.getSelectedItem();
				Integer number = Integer.valueOf(numberTextField.getText());
				String handleUser = handleUserTextField.getText();
				productDAO.updateStockNum(productName, number, true);
				dispose();
			}
		});
		submitButton.setBounds(187, 161, 93, 23);
		contentPane.add(submitButton);
		
		JLabel dateLabel = new JLabel("日   期：");
		dateLabel.setBounds(26, 95, 54, 15);
		contentPane.add(dateLabel);
		
		dateTextField = new JTextField();
		dateTextField.setBounds(100, 92, 66, 21);
		contentPane.add(dateTextField);
		dateTextField.setColumns(10);
		
		JLabel handleUser = new JLabel("处理人：");
		handleUser.setBounds(26, 130, 54, 15);
		contentPane.add(handleUser);
		
		handleUserTextField = new JTextField();
		handleUserTextField.setEditable(false);
		handleUserTextField.setBounds(100, 127, 66, 21);
		contentPane.add(handleUserTextField);
		handleUserTextField.setColumns(10);
		
		JButton clearButton = new JButton("clear");
		clearButton.setBounds(304, 161, 93, 23);
		contentPane.add(clearButton);
		
		setVisible(true);
	}
}
