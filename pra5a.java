class Demo{

	float pi=3.14;
	void show(){
		System.out.println("Area of Circle");
	}

}

class pra5a extends Demo{
	float r=2.0;
	void area(){
		System.out.println("pi*r*r");
}
public static void main(String s[]){
pra5a s1 = new pra5a();
s1.show();
s1.area();

}
	}
