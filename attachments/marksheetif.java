import java.util.*;
class marksheetif
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
int a=0;
a=(marks1+marks2)/2;
System.out.println ("Average=  "+a);
if(a<30)
  { 
  
   System.out.println("fail");
   }
   else if (a>30&&a<50)
   { 
    System.out.println("C");
	}
	else if(a>50&&a<70)
	{ 
    System.out.println("B");
	}
	else if(a>70&&a<=100)
	{ 
    System.out.println("A");
	}
   else 
   {
System.out.println("wrong input");
	}
   }
}
