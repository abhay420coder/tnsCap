package bitwise;
import java.util.Scanner;
public class EvenOdd {
		
	public static Scanner scn = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.println("give your number");
		int num = scn.nextInt();
		int ans =  (num)&(1);
		
		if(ans==0)System.out.println(" even");
		else System.out.println("odd");
	}
}
