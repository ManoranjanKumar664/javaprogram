import java.util.Scanner;
class value9
{
 public static void main(String args[])
{
 int a, pro=1;
Scanner one=new Scanner(System.in);
System.out.println("enter no. to find product");
a=one.nextInt();
while(a>0)
{
 pro=pro*a%10;
a=a/10;
}
System.out.println("product="+pro);
}
}