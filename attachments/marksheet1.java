import java.util.*;
class marksheet1
{
public static void main (String args[])
{
Scanner mk=new Scanner(System.in);
System.out.println ("enter name");
String name=mk.next();
System.out.println ("enter rollno.");
int rollno=mk.nextInt();
System.out.println ("enter marks1");
int marks1=mk.nextInt();
System.out.println ("enter marks2");
int marks2=mk.nextInt();
int a;
a=(marks1+marks2)/2;
System.out.println ("Average=  "+a);
}
}

