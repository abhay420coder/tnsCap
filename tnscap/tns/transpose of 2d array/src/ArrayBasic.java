
import java.util.Scanner;
public class ArrayBasic {
		public static Scanner scn = new Scanner(System.in);
		
		public static void main(String[] args) {
			System.out.println("give your row of array");
			int row  =scn.nextInt();
			System.out.println("give your column of array");
			int column  =scn.nextInt();
			
			int arr[][] = new int[row][column];
			
			
			System.out.println("give your input of array");
			for(int i= 0 ; i<row ; i++) {
				for(int j=0 ;j<column ; j++) {
					arr[i][j] = scn.nextInt();
				}
			}
			
			
			Print2D print = new Print2D();
			print.print2D(arr , row , column);
			
			
			Transpose2D transpose = new Transpose2D();
			transpose.transpose2D(arr , row , column);
			

			
		}
		
		
}
