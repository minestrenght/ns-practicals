import java.util.Scanner;
import java.io.*;
import java.lang.*;


public class Diffie_hellman{

public static void main(String []args)throws IOException {
	Scanner sc = new Scanner(System.in);
	double n,g,x,y,a,b;

	System.out.println("*****Diffie_hellman*****");
	System.out.println("Enter first prime number(n):");
	n = Integer.parseInt(sc.nextLine());

	int counter_n=0,counter_g=0;
	for(int i=1;i<n;i++)
	 {
	  if(n%i==0)
	  counter_n++;
	  }
	if(counter_n>2)
	{
	System.out.println(n+"is not a prime number.");
	System.exit(1);

	}
	System.out.print("Enter another prime number(g):");
	g= Integer.parseInt(sc.nextLine());
	for(int i=1;i<n;i++)
	 {
	  if(g%i==0)
	  counter_g++;
	  }
	if(counter_g>2)
	{
	System.out.println(g+"is not a prime number.");
	System.exit(1);

	}
		double m=g;
		System.out.println("Enter a number(x):");
		x= Integer.parseInt(sc.nextLine());

		System.out.println("Enter a number(y):");
		y= Integer.parseInt(sc.nextLine());
/*
for(int i=2;i<=x;i++)
g=g*m;
a=g%n;
g=m;
for(int i=2;i<=y;i++)
g=g*m;
b=g%n;
System.out.println(g);
m=b;

*/		
		a=(Math.pow(m,x))%n;
		b=(Math.pow(m,y))%n;
		double ka,kb;
		ka=(Math.pow(b,x))%n;
		kb=(Math.pow(a,y))%n;
		System.out.println("k1="+ka);
		System.out.println("k2="+kb);


		if(ka==kb)
		System.out.println(ka+" is the shared Symmetric key.");

   }

}