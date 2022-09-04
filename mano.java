import java.util.Scanner;
class mano
{
 public static void main(String args[])
{
 int a, pro=1;
Scanner one=new Scanner(System.in);
a=one.nextInt();
while(a>0)
{
pro=pro*a%10;
a=a/10;
}
System.out.println("product="+pro);
}
}