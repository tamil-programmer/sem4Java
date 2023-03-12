import java.lang.*;
import java.util.Scanner;



public class area_peri {

double pi = 3.14;

	public void area(int r){
		System.out.println("Area of Circle with Radius " + r +" is "+ 2*Math.PI*r);
	} 

	public void perimeter(int r){
		System.out.println("perimeter of Circle with Radius " + r +" is "+ pi*r*r);
	} 


	public static void main(String s[]){
		Scanner n = new Scanner(System.in); 

		System.out.println("Enter the Radius :");
		int r = n.nextInt();


		area_peri cal = new area_peri();

		cal.area(r);
		cal.perimeter(r);
	}


}