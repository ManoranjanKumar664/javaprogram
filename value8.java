import java.util.Scanner;

 class value8
{
 public static void main(String args[])
{
 int a, sum=0;
Scanner one=new Scanner(System.in);
System.out.println("enter no. to find sum of digit of a number");
a=one.nextInt();
while(a>0)
{
 sum=sum+a%10;
a=a/10;
}
System.out.println("sum="+sum);
}
}