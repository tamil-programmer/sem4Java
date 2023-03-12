import java.lang.*;
import java.util.Scanner;

public class pra2c{
	public static void main(String j[]){
		String s,t ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		s = sc.nextLine();
		int length = s.length();
		for(int i=length-1;i>=0;i--){
			t=t+s.charAt(i);
			}

System.out.println("Reverse String is :"+t);
	}
}