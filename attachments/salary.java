import java.util.*;
class salary
{
public static void main(String args[])
{
	
Scanner obj=new Scanner(System.in);
int s,t,h,d,net,gross;
float tax=0.0f,n=0.0f;
System.out.println("enter your salary");
s =obj.nextInt();
if (s>=20000)
 {
  t=(0.01)*20000;
  h=(0.02)*20000;
  d=(0.12)*20000;
  gross=t+h+d;
  tax=(3/100)*gross;
  n=gross-tax;
  System.out.println("Net salary"+n);
 }
 else if (s<20000)
  {
  t=(5/100)*20000;
  h=(10/100)*20000;
  d=(6/100)*20000;
  gross=t+h+d;
  tax=(gross*(0.03F));
  n=gross-tax;
  System.out.println("Net salary"+n);
 }
 
}
}
 

