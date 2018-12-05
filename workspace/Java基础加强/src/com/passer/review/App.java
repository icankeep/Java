package com.passer.review;

public class App {
	public static void main(String []args) {
		MotherBoard mb=new MotherBoard();
		/*Keyboard kb=new Keyboard();
		ClickMouse cm=new ClickMouse();
		mb.install(kb);
		mb.install(cm);
		mb.install(new IUSB() {
			@Override
			public void swapData() {
				System.out.println("打印机在打印");
				
			}
			@Override
			public String getName() {
				return "print";
			}
			
		});*/
		mb.doWork();
//		mb.unstall("ClickMouse");
	}
}
