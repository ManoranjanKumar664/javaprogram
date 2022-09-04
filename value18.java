import java.util.Scanner;
 
class value18
{
 int a, b,c;
 void input()
{
Scanner one=new Scanner(System.in);
 System.out.println("Enter any no.");
a=one.nextInt();
b=one.nextInt();
}
void output()
{
c=a+b;
System.out.println("sum="+c);
}
 
public static void main(String arg[])
{
value18 nothing=new value18();
nothing.input();
nothing.output();
}
}
