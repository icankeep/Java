package com.passer.smis.gui.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.passer.smis.gui.login.LoginJFrame;
import com.passer.smis.gui.product.AddProductJFrame;
import com.passer.smis.gui.product.DeleteProductJFrame;
import com.passer.smis.gui.sale.SaleJFrame;
import com.passer.smis.gui.stock.StockJFrame;

public class MainJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new MainJFrame();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainJFrame() {
		setTitle("进存销系统@passer");
		//设置窗口点关闭之后的状态
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置窗口位置及大小
		setBounds(200, 50, 907, 599);
		
		//设置菜单栏
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//设置菜单
		JMenu menu = new JMenu("菜单");
		menuBar.add(menu);
		JMenuItem userInfoNow_menuItem = new JMenuItem("当前用户信息");
		menu.add(userInfoNow_menuItem);
		
		//注销操作
		JMenuItem logout_menuItem = new JMenuItem("注销");
		logout_menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new LoginJFrame();
			}
		});
		menu.add(logout_menuItem);
		
		//退出操作
		JMenuItem exit_menuItem = new JMenuItem("退出");
		exit_menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menu.add(exit_menuItem);
		
		//进货菜单
		JMenu stock_menu = new JMenu("进货");
		menuBar.add(stock_menu);
		
		//调用进货单界面，通过填写表单并提交可以完成进货操作
		JMenuItem stockList_menuItem = new JMenuItem("进货单");
		stockList_menuItem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new StockJFrame();
			}
		});
		stock_menu.add(stockList_menuItem);
		
		//调用进货记录界面，可以显示所有的进货记录
		JMenuItem stockRecord_menuItem = new JMenuItem("进货记录");
		stock_menu.add(stockRecord_menuItem);
		
		//销货菜单
		JMenu sale_menu = new JMenu("销货");
		menuBar.add(sale_menu);
		
		//调用销货单界面，填写表单并提交可以完成销货操作
		JMenuItem saleList_menuItem = new JMenuItem("销货单");
		saleList_menuItem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new SaleJFrame();
			}
		});
		sale_menu.add(saleList_menuItem);
		
		//调用销货记录界面，可以显示所有的销货记录
		JMenuItem saleRecord_menuItem = new JMenuItem("销货记录");
		sale_menu.add(saleRecord_menuItem);
		
		//库存菜单
		JMenu storage_menu = new JMenu("库存");
		menuBar.add(storage_menu);
		
		//调用库存单界面，可以显示当前仓库所有产品的库存量
		JMenuItem storageList_menuItem = new JMenuItem("库存单");
		storage_menu.add(storageList_menuItem);
		
		//调用进货销货记录界面，可以查看所有的进货销货记录
		JMenuItem stockSaleRecord_menuItem = new JMenuItem("进货销货记录");
		storage_menu.add(stockSaleRecord_menuItem);
		
		//产品菜单
		JMenu product_menu = new JMenu("产品");
		menuBar.add(product_menu);
		
		//调用添加产品的菜单
		JMenuItem addProduct_menuItem = new JMenuItem("添加产品");
		addProduct_menuItem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new AddProductJFrame();
			}
		});
		product_menu.add(addProduct_menuItem);
		
		//调用删除产品的菜单
		JMenuItem deleteProduct_menuItem = new JMenuItem("删除产品");
		deleteProduct_menuItem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new DeleteProductJFrame();
			}
		});
		product_menu.add(deleteProduct_menuItem);
		
		JMenu data_menuItem = new JMenu("数据");
		menuBar.add(data_menuItem);
		
		JMenuItem profitSort_menuItem = new JMenuItem("盈利排行");
		data_menuItem.add(profitSort_menuItem);
		
		JMenuItem saleSort_menuItem = new JMenuItem("销售排行");
		data_menuItem.add(saleSort_menuItem);
		
		//帮助菜单
		JMenu help_menu = new JMenu("帮助");
		menuBar.add(help_menu);
		
		//跳转对应官网
		JMenuItem service_menuItem = new JMenuItem("客服");
		help_menu.add(service_menuItem);
		
		//跳转发送邮件界面
		JMenuItem email_menuItem = new JMenuItem("联系邮箱");
		help_menu.add(email_menuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//设置窗口可视性
		setVisible(true);
	}

}
