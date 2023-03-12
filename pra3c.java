import java.util.Scanner;
public class pra3c
{
public static void main(String s1[])
{
int n[] =new int[]{13,22,27,11,4};
int s = n[0];
int g = n[1];
int i;
for(i=0;i<n.length;i++)
{
System.out.println(n[i]);
}
for(i=1;i<n.length;i++)
{
if(n[i]>g)
{
g=n[i];
}
else if(n[i]<s)
{
s=n[i];
}
}
System.out.println("largest number in array is: "+g);
System.out.println("smallest number in array is: "+s); 
}
}
