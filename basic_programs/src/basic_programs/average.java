package basic_programs;

import java.util.Scanner;

public class average {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("how many numbers you can add");
	int size=sc.nextInt();
	int sum=0;
	int sumavg[]=new int[size];

	System.out.println("enter your numbers");
	for(int i=0; i<size;i++) {
		sumavg[i]=sc.nextInt();
		sum=sum+sumavg[i];
		
	}
	double sum1=sum;
	System.out.println("sum is:"+sum1);
	System.out.println("avg is:"+sum1/size);
	sc.close();
}
}
