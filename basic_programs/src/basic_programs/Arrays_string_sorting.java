package basic_programs;

import java.util.Arrays;

public class Arrays_string_sorting {
	public static void main(String[] args) {

		String arr1[] = { "ravi", "kumar", "mahesh", "stya" };
		String arr2[] = { "pawan", "mani", "sai", "ram" };
		int size1 = arr1.length;
		int size2 = arr2.length;
		String arr3[]=new String[size1+size2];
		System.arraycopy(arr1, 0, arr3, 0, size1);
		System.arraycopy(arr2, 0, arr3, size1, size2);
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
	}
}