import java.util.Scanner;
public class LeapYear {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("give your year");
		int num = scn.nextInt();
	
		
		if((num%4==0 && num%100!=0) || (num%400==0))System.out.println(" leap");
		else System.out.println("no leap");
	}
}
