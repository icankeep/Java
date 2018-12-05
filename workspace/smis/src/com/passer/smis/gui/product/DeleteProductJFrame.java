package com.passer.smis.gui.product;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.passer.smis.dao.IProductDAO;
import com.passer.smis.dao.impl.ProductDAOImpl;
import com.passer.smis.domain.Product;

public class DeleteProductJFrame extends JFrame {

	private JPanel contentPane;
	private IProductDAO productDAO = new ProductDAOImpl();
	private JComboBox<String> productNameComboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteProductJFrame frame = new DeleteProductJFrame();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DeleteProductJFrame() {
		System.out.println("DeleteProductJFrame.DeleteProductJFrame()");
		List<Product> productList = productDAO.getAllList();
		
		setTitle("删除产品");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(350, 200, 362, 185);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton deleteButton = new JButton("delete");
		deleteButton.setBounds(212, 92, 93, 23);
		deleteButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String productName = (String) productNameComboBox.getSelectedItem();
				productDAO.delete(productName);
				dispose();
			}
		});
		contentPane.add(deleteButton);
		
		productNameComboBox = new JComboBox<>();
		productNameComboBox.setBounds(103, 40, 135, 23);
		contentPane.add(productNameComboBox);
		for (Product product : productList) {
			productNameComboBox.addItem(product.getProductName());
		}
		
		JLabel productNameLabel = new JLabel("名   称：");
		productNameLabel.setBounds(46, 43, 54, 15);
		contentPane.add(productNameLabel);
		
		setVisible(true);
	}
}
