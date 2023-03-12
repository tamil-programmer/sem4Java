import java.io.*;
import java.util.Scanner;

class pra8c{
	public static void main(String args[]) throws IOException{

String s1,s2,s3;
Scanner st = new Scanner(System.in);
System.out.print("Enter Name  :");
s1 = st.nextLine();
System.out.print("Enter phone  :");
s2 = st.nextLine();
System.out.print("Enter Address  :");
s3 = st.nextLine();
OutputStream fos = new FileOutputStream("test.txt");
byte b1[] = s1.getBytes();
fos.write(b1);
byte b2[] = s2.getBytes();
fos.write(b2);
byte b3[] = s3.getBytes();
fos.write(b3);
fos.close();
System.out.println("File created ");
}
	}