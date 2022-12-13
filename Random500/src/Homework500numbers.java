import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Homework500numbers {
	public static void main(String[]args) {
	    
		  Random rnd = new Random();
		  int number;
		  int[] num =new int[500];
		  for(int i=0; i<500;i++) {
			  number=rnd.nextInt(500);
			  num[i]=number;
		  }
		  Arrays.sort(num);
		  for(int j=0;j<500;j++) {
			  System.out.println(num[j]+"");
		  }
		  System.out.println();
		  
		  @SuppressWarnings("resource")
		Scanner ui= new Scanner(System.in);
		    System.out.println("Enter the nth smallest number");
		    int n = ui.nextInt();
		    System.out.println(num[n-1]);
		    
		   /* for(int counter=a; counter<=500; counter++){
		        number = num.nextInt(1000);
		        System.out.println(number + "");*/
 }
	}
	