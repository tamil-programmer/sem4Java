import java.util.Vector; 
public class pra7a{
	public static void main(String s[]){
		Vector<String> v= new Vector<String>();
		v.add("red");
		v.add("green");
		v.add("blue");
		System.out.println(v);
		v.add(2,"yellow");
		System.out.println(v);
		System.out.println("element at 3r	d position"+v.get(3));
		System.out.println("first element "+v.firstElement());
		System.out.println("last element "+v.lastElement());
		System.out.println("is vector Empty?"+v.isEmpty());
	}
}