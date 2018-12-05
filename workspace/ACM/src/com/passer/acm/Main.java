package com.passer.acm;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		Set <Integer> set=new HashSet<>();
		int T=sc.nextInt();
		while(T-->0) {
			int n=sc.nextInt();
			while(n-->0) {
				set.add(sc.nextInt());
			}
			System.out.println(set.size());
			set.clear();
		}
	}
}
