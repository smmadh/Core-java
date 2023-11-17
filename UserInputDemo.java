package com.edu;

import java.util.Scanner;

public class UserInputDemo {
	public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name:");
		String name=sc.nextLine();
		System.out.println(name);
		System.out.println("enter your age:");
		int age=sc.nextInt();
		System.out.println(age);
		System.out.println("enter ypour score:");
		float percentage=sc.nextFloat();
		System.out.println("my percentage is:"+percentage);
		System.out.println("----------------------");
		

		
	
	}

}
