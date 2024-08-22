package corej;

import java.util.Scanner;

public class java1 {
double p,t,r;
double si, ci;
Scanner s;
   void input()
   {
	   s=new Scanner(System.in);
	   System.out.println("Enter principal Amount");
	   p=s.nextInt();
	   System.out.println("Enter no of yrs");
	   t=s.nextInt();
	   System.out.println("Enter rate of intrest");
	   r=s.nextInt();
	   
	   
   }
 void compute()
 {
	 si=(p*t*r)/100;
	 ci=p*Math.pow(1+(r/100),t);
	 
 }
 void display()
 {
	 System.out.println("Simple intrest is:"+si);
	 System.out.println("compound intrest is "+ci);
	 
 }

	
	
 public static void main(String[] args)
 {
 java1 j=new java1();
 j.input();
 j.compute();
 j.display();
 
 
 
}
}
