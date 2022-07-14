package arraya;
import java.util.Scanner;
public class ArrayBasic {
		public static Scanner scn = new Scanner(System.in);
		
		public static void main(String[] args) {
			System.out.println("give your size of array");
			int size  =scn.nextInt();
			
			int arr[] = new int[size];
			
			Input input = new Input();
			input.input1D(arr);
			
			Print print = new Print();
			print.print1D(arr);
			
			Find find = new Find();
			find.find1D(arr);
			
		}
}
