import java.lang.*;
public class pra7b extends Thread{
	public static void main(String s[])
	throws Exception
	{
	System.out.println(Thread.currentThread().getName());
	for(int i=0;i<10;i++){
	new Thread(""+i){
	public void run(){
	System.out.println("Thread:"+getName()+"running");
	}

	}.start();
	}
	}
}