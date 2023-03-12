import java.io.*;
public class pra8a{
	public static void main(String s[]) throws IOException{
	InputStream input = new FileInputStream("Tamil.txt");
	DataInputStream inst = new DataInputStream(input);
	int count = input.available();
byte[] a = new byte[count];
inst.read(a);
for(byte b:a){
char k = (char) b;
System.out.print(k);
}
}


}