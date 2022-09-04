// program to run first n natural number.
import java.util.Scanner;
import java.lang.System;

class value3
{
 public static void main(String args[])
{
int i, a;
Scanner one=new Scanner(System.in);
System.out.println("enter the no. of term");
a=one.nextInt();
System.out.println("first"+" "+a+" "+"natural no. are:");
for(i=1;i<=a;i++)
{
 System.out.println(i);
}
}
}