import java.lang.*;
import java.util.Scanner;

public class pra3b{
	public static long calc(){
		long x =0L;
		char c[] = {'0','1','2','3','4','5','6','7','8','9'};
		long sum = 0L;
		for(int i=c.length-1;i>=0;i--){
			x=c[i]-'0'; //ascii code for '0' is 48
			sum = sum+x;
		}
		return sum;
		}
		public static void main(String s[]){
			long r = calc();
			System.out.println("integer is " + r);
			}
		}









