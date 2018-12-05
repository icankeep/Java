package com.passer.smis.gui.stock;

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

public class StockJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField numberTextField;
	private JTextField dateTextField;
	private JTextField handleUserTextField;
	private JTextField idTextField;
	private IProductDAO productDAO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StockJFrame frame = new StockJFrame();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StockJFrame() {
		productDAO = new ProductDAOImpl();
		List<Product> productList = productDAO.getAllList();
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(350, 200, 406, 235);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel productNameLabel = new JLabel("名   称：");
		productNameLabel.setBounds(40, 35, 54, 15);
		contentPane.add(productNameLabel);
		
		JLabel numberLabel = new JLabel("数   量：");
		numberLabel.setBounds(40, 63, 54, 15);
		contentPane.add(numberLabel);
		
		JLabel dateLabel = new JLabel("日   期：");
		dateLabel.setBounds(40, 88, 54, 15);
		contentPane.add(dateLabel);
		
		JLabel handleUserLabel = new JLabel("处理用户：");
		handleUserLabel.setBounds(40, 113, 72, 15);
		contentPane.add(handleUserLabel);
		
		JLabel idLabel = new JLabel("编   号：");
		idLabel.setBounds(40, 10, 54, 15);
		contentPane.add(idLabel);
		
		JComboBox<String> productNameComboBox = new JComboBox<>();
		for (Product product : productList) {
			productNameComboBox.addItem(product.getProductName());
		}
		productNameComboBox.setBounds(104, 31, 122, 23);
		contentPane.add(productNameComboBox);
		
		numberTextField = new JTextField();
		numberTextField.setBounds(104, 60, 66, 21);
		contentPane.add(numberTextField);
		numberTextField.setColumns(10);
		
		dateTextField = new JTextField();
		dateTextField.setBounds(104, 85, 66, 21);
		contentPane.add(dateTextField);
		dateTextField.setColumns(10);
		
		
		handleUserTextField = new JTextField();
		handleUserTextField.setEditable(false);
		handleUserTextField.setBounds(104, 110, 66, 21);
		contentPane.add(handleUserTextField);
		handleUserTextField.setColumns(10);
		
		idTextField = new JTextField();
		idTextField.setEditable(false);
		idTextField.setBounds(104, 7, 66, 21);
		contentPane.add(idTextField);
		idTextField.setColumns(10);
		
		JButton submitButton = new JButton("submit");
		submitButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String productName = (String) productNameComboBox.getSelectedItem();
				Integer number = Integer.valueOf(numberTextField.getText());
				String handleUser = handleUserTextField.getText();
				productDAO.updateStockNum(productName, number, false);
				dispose();
			}
		});
		submitButton.setBounds(181, 154, 93, 23);
		contentPane.add(submitButton);
		
		JButton clearButton = new JButton("clear");
		clearButton.setBounds(284, 154, 93, 23);
		contentPane.add(clearButton);
		
		setVisible(true);
	}
}
