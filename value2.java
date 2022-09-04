import java.util.Scanner;
import java.lang.System;
 
 class value1
{
 
public static void main(String args[])
{
 
int a, b, c;
Scanner mano=new Scanner(System.in);
System.out.println("enter the first number");
a=mano.nextInt();
System.out.println("Enter the second number");
b=mano.nextInt();
c=a+b;
System.out.print("sum=");
System.out.println(c);
}
}