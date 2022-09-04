import java.util.Scanner;
 class value10
{
 public static void main(String args[])
{
 int a, pri=0,com=0, i;
Scanner one=new Scanner(System.in);
System.out.println("Enter any numer");
a=one.nextInt();
for(i=2;i<a;i++)
{
 if(a%i==0)
{
System.out.println("composite");
break;
}
else
{
 System.out.println("primary");
break;
}
}
}
}