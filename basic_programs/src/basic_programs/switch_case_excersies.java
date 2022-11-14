package basic_programs;

import java.util.Scanner;

public class switch_case_excersies {
	public static void main(String[] args) {
	//System.out.println("calculate by using number");
		System.out.println("enter the number");
		Scanner Sc=new Scanner(System.in);
		int week=Sc.nextInt();
//		8
		switch (week)
		{
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		case 8:
			System.out.println("mon,tue tue,");
			break;
			
			default:
				
			System.out.println("invalid input! please enter week number between 1-7");
				break;
		}
		
				
	}

	
		
	}


