package arraya;

import java.util.Scanner;

public class Find {
	public static Scanner scn = new Scanner(System.in);
	public void find1D(int arr[]) {
		System.out.println("which index of data you want to found");
		
		int data = scn.nextInt();
		
		for(int i =0 ; i<arr.length ; i++) {
			if(arr[i]== data) System.out.println("the number of " + arr[i] + " is :- " + (i+1));
		}
	}
}
