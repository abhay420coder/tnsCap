package arraya;

import java.util.Scanner;

public class Input {
	public static Scanner scn = new Scanner(System.in);
	public void input1D(int arr[]) {
		System.out.println("write your input data in array");
		for(int i =0 ; i<arr.length ; i++) {
			arr[i] = scn.nextInt();
		}
	}
}
