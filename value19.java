import java.util.Scanner;
 
class value19
{
 public static void main(String args[])
{
   int i, j, n;
Scanner one=new Scanner(System.in);
System.out.print("Enter no. of term");
n=one.nextInt();
for(i=n;i>=1;i--)
{
for(j=1;j<=i;j++)
{
System.out.print(j);
}
System.out.println();
}
}
}