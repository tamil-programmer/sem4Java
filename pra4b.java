import java.util.Scanner;
public class pra4b
{

	public pra4b(){
		System.out.println("Hello");
	}

	public void finalize(){
	System.out.println("Destroyed");
	}


public static void main(String s[])
{

pra4b s1 = new pra4b();
s1 = null;
System.gc();

}
}
