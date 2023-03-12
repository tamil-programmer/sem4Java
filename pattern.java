
import java.util.Scanner;

class pattern {

public static void main(String s[]){

Scanner n = new Scanner(System.in);

int row = n.nextInt();

for(int i=1;i<=row;i++){

	for(int j=0;j<=i;j++){
	System.out.print("");
		
		}
	
	for(int k=0;k<=row-1-i;k++){
	System.out.print("*"+" ");
		
		}

System.out.println();
}
n.close();

}

}