import java.util.Scanner;
class value12
{
 public static void main(String args[])
{
 int a, fact=1, i;
Scanner one=new Scanner(System.in);
a=one.nextInt();
for(i=1;i<=a;i++)
{
fact=fact*i;
}
System.out.println("fact="+fact);
}
}