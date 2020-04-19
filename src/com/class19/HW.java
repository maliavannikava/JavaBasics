package com.class19;

public class HW {
	public static void main(String[] args){
		String str="hello";
		
		String str1="";
		for(int i=0; i<str.length(); i++) {
			if(i==0) {
				str1+=str.charAt(i);
			}else {
			if(str.charAt(i)>str.charAt(i-1)) {
			str1+=str.charAt(i);
			
			}
			}
		}
		System.out.println(str1);
		
	  }
}
