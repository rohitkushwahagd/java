class reverse
   {
public static void main(String arg[])
 {
  int a=567, d,c,e,f,n;
System.out.println("number is ="+a);
d=a%10;
c=a/10;
e=c%10;
f=c/10;
n=d*100+e*10+f;
System.out.println("reverse number ="+n);
if(a==n)
  System.out.println("no. is palindrome");  
 }
}