import java.lang.*;
import java.util.Scanner;

public class pra2b{
	public static void main(String s[]){
		int num1;
		String num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter BInary number : ");
		num2 = sc.nextLine();
		System.out.println("Enter Decimal number : ");
		num1 = sc.nextInt();
		System.out.println("Binary to Decimal : "+ Integer.parseInt(num2,2));
		System.out.println("Decimal to Binary : "+ Integer.toBinaryString(num1));
	}
}