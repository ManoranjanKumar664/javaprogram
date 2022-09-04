//program to check whether a number is positive or negative.

 import java.util.Scanner;
import java.lang.System;

class value5
{
public static void main(String args[])
{
 int a;
Scanner one=new Scanner(System.in);
System.out.println("enter a numer to check whether it is negative or positive");
a=one.nextInt();
if(a>0)
System.out.println("positive");
else
if(a<0)
System.out.println("negative");
else
System.out.print("zero");
}
}