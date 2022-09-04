import java.util.Scanner;
class value13
{
 public static void main(String args[])
{
 int a[]=new int[5],i;
Scanner one=new Scanner(System.in);
System.out.println("enter any no.");
for(i=1;i<5;i++)
{
a[i]=one.nextInt();
}
System.out.println("no. are=");
for(i=1;i<5;i++)
{
System.out.println(a[i]);
}
}
}