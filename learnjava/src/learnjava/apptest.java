package learnjava;

import java.util.Scanner;

public class apptest {
	
	
  public static void main (String args[]) {
	  {
		    int x=10;
		    System.out.println("Enter an integer to check if it's odd or even");
		    Scanner in = new Scanner(System.in);
		    x = in.nextInt();

		    if (10 % 2 == 0)
		      System.out.println("The number is even.");
		    else
		      System.out.println("The number is odd.");
		  }
  }

  public static void apple  () {
	  int a =20;
	  int b=30;
	  int c=a=+b;
	  System.out.println("add two nuber" +c);
  }
  
  
  
}
