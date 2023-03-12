import java.lang.*;
import java.util.Scanner;


public class 1a {

public static void main(String s[]){


Scanner n = new Scanner(System.in);
System.out.print("Enter a number for the table : ");
int num = n.nextInt();

for(int i = 1; i<11;i++){
System.out.println(num + " X " + i + " = " + i*num  );

}




}}