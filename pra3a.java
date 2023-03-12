import java.lang.*;
import java.util.Scanner;

public class pra3a{
	public static void main(String j[]){
		String st;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sring : ");
		st = sc.nextLine();
		count(st);
		}
	public static void count(String x){

		char ch[] = x.toCharArray();
		int l=0,s=0,n=0,a=0;
		for(int i=0;i<x.length();i++){
			if(Character.isLetter(ch[i])){
					l++;
				}
			else if(Character.isDigit(ch[i])){
				n++;
				}
			else if(Character.isSpaceChar(ch[i])){
				s++;
				}
			else{
				a++;
			}
}
System.out.println("Letter :" + l);
System.out.println("Numbers :" + n);
System.out.println("Space :" + s);
System.out.println("Others :" + a);
	}
}