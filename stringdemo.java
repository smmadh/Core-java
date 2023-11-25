package operator;

public class stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//concat
		String str="hello";
		String str1="world";
		System.out.println(str.concat(str1));
		
//using ob
		String str2=new String("hello");
		str2.concat("world");
		System.out.println(str2);
		
//length
		String str4="hello";
		int str5=str4.length();
		System.out.println(str5);
		
//charAT
		String str6="madhu sudhan";
		char c=str6.charAt(7);
		System.out.println(c);

//substring
		String str8="madhu sudhan";
		String str9=str8.substring(1,7);
		System.out.println(str9);
		
//equals
		String stra="madhu sudhan";
		String strb="madhu sudhan";
		System.out.println(stra.equals(strb));
		
//equalignorecase
		String stra1="madhu sudhan";
		String strb2="MADHU SUDHAN";
		System.out.println(stra1.equalsIgnoreCase(strb2));
		
//uppercase
		String stra2="madhu sudhan";
		System.out.println(stra2.toUpperCase());
		
//lowercase
		String strb3="MADHU SUDHAN";
		System.out.println(strb3.toLowerCase());
		
//contains
		String name="madhu sudhan";  
		System.out.println(name.contains("hello"));  
		System.out.println(name.contains("madhu"));  
		System.out.println(name.contains("sudhan"));  
//replace
		String s1="madhu";
		System.out.println(s1.replace('a','e'));
//trim
		String s2="   madhu sudhan";
		System.out.println(s2.trim());
//		
		
		
		
		
		
		
		
		
		
		

	}

}
