package basic_programs;

import java.util.Scanner;

public class numbe_rpalindrome {
public static void main(String[] args) {
//	int num=123321;
//	
//	int org_num=num;
//	int rev=0;
//	while(num!=0) {
//		rev=rev*10+num%10;
//		num=num/10;
//	}
//	System.out.println("reverseNum:"+rev);
//	if(org_num==rev) {
//		System.out.println("this is palindrome number");
//	}else {
//		System.out.println("this is not palindrome number");
//	}
	
	// string palindrome 
	
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the string ");
	String str=sc.next();
	String str1=str;
	String rev1="";
	int len=str.length();
	for(int i=len-1;i>=0;i--) {
		System.out.print(str.charAt(i));
	}
	if(str.equals(rev1)) {
		System.out.println("this string is palindrome");
	}else {
		System.out.println("this is string is not palindrome");
	}
}

}
