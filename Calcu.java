package com.edu;

import java.util.Scanner;

public class Calcu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a:");
		int a=sc.nextInt();
		System.out.println(a);
		System.out.println("enter b:");
		int b=sc.nextInt();
		System.out.println(b);
		int sum;
		sum=a+b;
		System.out.println("sum:"+sum);
		int sub;
		sub=a-b;
		System.out.println("sub:"+sub);
		int mul;
		mul=a*b;
		System.out.println("mul:"+mul);
		int div;
		div=a/b;
		System.out.println("div:"+div);
		int mod;
		mod=a%b;
		System.out.println("mod:"+mod);
		
		
		
		
		
		

	}

}
