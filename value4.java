//program to check whether the number is odd or even.

import java.util.Scanner;
import java.lang.System;

class value4
{
 public static void main(String args[])
{
 int a;
Scanner one=new Scanner(System.in);
System.out.println("enter any number to check whether it is odd or even");
a=one.nextInt();
if(a%2==0)
{
 System.out.println("even");
}
 else
{
 System.out.println("odd");
}
}
}