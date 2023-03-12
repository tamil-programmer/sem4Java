class A{
void show(){
System.out.println("Base class");
}

}

class B extends A{
void show(){
System.out.println("Derived class");
}

}

class pra5b extends B{

public static void main(String s[]){

pra5b s1 = new pra5b();
s1.show();

}

}