package basic_programs;

import java.util.Scanner;

public class String_palindrome {
	public static void main(String[] args) {
		
	
  Scanner sc=new Scanner(System.in);
  System.out.println("enter your string");
  String s=sc.next();
  String ss=s;
  String rev="";
  int len=s.length();
  for(int i=len-1;i>=0;i--) {
//	  System.out.print(s.charAt(i));
  }
  if(ss.equals(rev)) {
	  System.out.println("this is palindrome number");
  }
  else {
	  System.out.println("this is not palindrome string");
  }
  
  
}

}