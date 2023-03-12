import java.util.Scanner;
public class pra4a
{

int n,temp,i,j;
public void desc(int num[]){

	for(i=0;i<num.length;i++){
		for(j=i+1;j<num.length;j++){
			if(num[i]<num[j]){
				temp=num[i];
				num[i]=num[j];
				num[j]=temp;		
			}
		}
	}
System.out.println("Desceding Order:");
	for (i=0;i<num.length;i++)
		{
			System.out.println(num[i] + " ");
		}
	}


public void asec(int num[]){

	for(i=0;i<num.length;i++){
		for(j=i+1;j<num.length;j++){
			if(num[i]>num[j]){
				temp=num[i];
				num[i]=num[j];
				num[j]=temp;		
			}
		}
	}
System.out.println("Accessening Order:");
	for (i=0;i<num.length;i++)
		{
			System.out.println(num[i] + " ");
		}
	}



public static void main(String s[])
{

 pra4a s1 = new pra4a();
int ar[]={13,22,27,11,4};
s1.asec(ar);
s1.desc(ar);

}
}
