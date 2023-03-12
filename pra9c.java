class pra9c
{
public static void main(String s[])
{
int a[] = {5,10};
int b=5;
try 
{
int x=a[2]/(b-a[0]);
} 
catch (ArithmeticException e)
{
System.out.println("div by zero");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array Error");
}
int y=a[1]/a[0];
System.out.println(y);
}}