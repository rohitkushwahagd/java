import java.util.Scanner;
class If3
{
 public static void main(String args[])
 {
 Scanner obj=new Scanner(System.in);
 System.out.println("Enter value of a ");
 int a=obj.nextInt();
 System.out.println("Enter value of b ");
 int b=obj.nextInt();
 System.out.println("Enter value of c ");
 int c=obj.nextInt();
 if(a>b&&a>c)
 {
	 System.out.println("A is greatest");
 }
 else if(b>a&&b>c)
 {
	 System.out.println("B is greatest");
 }	
else
{
	System.out.println("C is greatest");
}
	
 }
 
 
}
