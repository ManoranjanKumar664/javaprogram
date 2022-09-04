//program to find the maximum number among the 3 numers.

 import java.util.Scanner;
import java.lang.System;

class value6
{
 public static void main(String args[])
{
 int a, b, c;
Scanner one=new Scanner(System.in);
System.out.println("enter any three number");
a=one.nextInt();
b=one.nextInt();
c=one.nextInt();
if(a>b&&a>c)
System.out.println(a+" "+" is max");
else
if(b>a&&b>c)
System.out.println(b+" "+"is max");
else
System.out.println(c+" "+"is max");
}
}