import java.util.*; 
class greatest
{ 
public static void main(String args[])
{
Scanner obj=new Scanner (System.in);
System.out.println("a ");
int a =obj.nextInt();
System.out.println("b ");
int b =obj.nextInt();
System.out.println("c ");
int c =obj.nextInt(); 
if (a>b)
{ 
if (a>c)
    { System.out.println(" a is greatest");
	} else
	{ System.out.println("c is greatest");
    }
}
else if (b>a)
   {
	if (b>c)
    { System.out.println(" b is greatest");
	}       
	   else
	   {      System.out.println("c is greatest");
    }
   }
	else
{
System.out.println("c is greatest");
}
	}
}

