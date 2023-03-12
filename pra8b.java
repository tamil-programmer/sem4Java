import java.io.*;

public class pra8b{

	public static void main(String s[]){
	FileInputStream instream = null;
	FileOutputStream outstream = null;

try{
		File inF = new File("Tamil.txt");
		File outF  = new File("yaanai.txt");
		instream = new FileInputStream(inF);
		outstream = new FileOutputStream(outF);
		byte[] buffer = new byte[1024];
		int length;
		while((length=instream.read(buffer))>0){
			outstream.write(buffer,0,length);
}
instream.close();
outstream.close();
System.out.println("Done!");
	}
catch(Exception e){
e.printStackTrace();
}
	}


}