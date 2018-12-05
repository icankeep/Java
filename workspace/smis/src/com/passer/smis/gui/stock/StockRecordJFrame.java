package com.passer.smis.gui.stock;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import com.passer.smis.domain.Product;

public class StockRecordJFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StockRecordJFrame frame = new StockRecordJFrame();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StockRecordJFrame() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String [] tableHeader = {"id","productName","costPrice","salePrice","supplier","unit","stockNum"};
		String [][] data = {{"1","apple","5.00","10.00","aa","kg/yuan","1000"}};
		table_2 = new JTable(data,tableHeader);
		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane);
		
		setVisible(true);
	}
}
