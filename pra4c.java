abstract class Calc{

public abstract int sqr(int n1);
public abstract int cube(int n1);
public void show(){
System.out.println("hello");
}
}

public class pra4c extends Calc{

public int sqr(int n1){
	return n1*n1;
}

public int cube(int n1){
	return n1*n1*n1;
}

public static void main(String s[]){

	pra4c st = new pra4c();
	System.out.println(st.sqr(3));
	System.out.println(st.cube(4));
	st.show();
}


}
