package com.calculator.pakage;

public class StngReverse {

	public String Rvr(String str) {
		
		/*char[] s1=str.toCharArray();
		for(int i=s1.length-1;i>=0;i--) {
			System.out.println("Reverse string : "+s1[i]);
			
		}
		return s1.toString();*/
		
		 StringBuilder strBult=new StringBuilder(); strBult.append(str);
		  strBult.reverse();
		 
		return strBult.toString();
	}

}
