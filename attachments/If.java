/*
control structure :
1-conditional(if)
2-branching(switch)
3-iteration/looping(while/do while/for)
1-conditional
if  :
      simple if,if else,if elseif else or ladder else if,nested if
->if()
syntax:
  if(con)
{
statement;
}
*/
import java.util.Scanner;
class If
{
 public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int a,b;
System.out.println("Enter value of a ");
a=obj.nextInt();
System.out.println("Enter value of b ");
b=obj.nextInt();
if(a>b)
{
System.out.println("A is greater than B");
}

}
}
