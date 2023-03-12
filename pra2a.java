import java.lang.*;
import java.util.Scanner;

public class pra2a{
		public static void main(String s[]){
			long l1,l2;
			int i=0, rem=0;
			int sum[] = new int[20];
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first binary number");
			l1 = sc.nextLong();
			System.out.println("Enter second binary number");
			l2 = sc.nextLong();		
	
			while(l1!=0||l2!=0){
				sum[i++]=(int)((l1%10+12%10+rem)%2);
				rem=(int)((l1%10+l2%10+rem)/2);
				l1=l1/10;
				l2 = l2/10;
				}
				
				if(rem!=0){
					sum[i++] = rem;
					}
				--i;
				System.out.println("Sum of l1 + l2 = ");
				while(i>=0){
					System.out.println(sum[i--]);
					}
				}
}
					