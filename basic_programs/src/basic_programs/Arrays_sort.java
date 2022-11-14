package basic_programs;

import java.util.Arrays;

public class Arrays_sort {
	public static void main(String[] args) {
		int arr1[] = { 1, 3, 8, 7, 6 };
		int arr2[] = { 2, 5, 9, 4, 10 };
		
		int size1 = arr1.length;
		int size2 = arr2.length;
		
		// we can print the arrays in three ways
		// 1. by using toString & for and foreach loop

//        System.out.println(size1);
//        System.out.println(size2);
//        Arrays.sort(arr1);
//		Arrays.sort(arr2);

		int arr3[] = new int[size1 + size2 ];
		System.arraycopy(arr1, 0, arr3, 0, size1);
		System.arraycopy(arr2, 0, arr3, size1, size2);
		
		Arrays.sort(arr3);
		
		System.out.println(Arrays.toString(arr3));

//		System.out.println(Arrays.toString(arr2));
//		for (int ar : arr1) {
//			System.out.print(ar + " ");
//		}
	}
}
