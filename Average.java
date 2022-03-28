package Myprogram;
import java.util.*;
public class Average {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter First Num: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Num: ");
		int num2 = sc.nextInt();
		System.out.println("Enter Third Num: ");
		int num3 = sc.nextInt();
		System.out.println("Enter Forth Num: ");
		int num4 = sc.nextInt();
		System.out.println("Enter Fifth Num: ");
        int num5 = sc.nextInt();

	int add = num1+num2+num3+num4+num5;
	System.out.println("Average: " +add/5);
	
	
	
	}
}