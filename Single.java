package com.inter;

class Employee  
{    
float salary=34534*12;    
}    
class Executive extends Employee  
{   
float bonus=3000*6;  
}
public class Single {

	public static void main(String[] args) {
		Executive obj=new Executive();   
		System.out.println("Total salary credited: "+obj.salary);    
		System.out.println("Bonus of six months: "+obj.bonus);

	}

}
