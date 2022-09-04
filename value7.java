import java.util.Scanner;
import java.lang.System;

class value7
{
 public static void main(String args[])
{
int a, b, c, ch;
Scanner one=new Scanner(System.in);
System.out.println("enter any two number");
a=one.nextInt();
b=one.nextInt();
System.out.println("enter your choice");
ch=one.nextInt();
switch(ch)
{
case 1:
c=a+b;
System.out.println("sum="+c);
break;
case 2:
c=a-b;
 System.out.println("difference="+c);
break;
case 3:
c=a*b;
System.out.println("product="+c);
break;
case 4:
c=a/b;
System.out.println("quotient="+c);
break;
default:
System.out.println("invalid choice");
}
}
}
