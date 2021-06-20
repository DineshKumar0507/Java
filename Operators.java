import java.util.*;
public class Operators
{
public static void main(String []args)
{
System.out.println("Enter three no.s");
Scanner sc = new Scanner(System.in);
int []a = new int[3];
for(int i=0; i<3;i++)
{
a[i]=sc.nextInt();
}
if (a[0]>a[1])
{
   if(a[0]>a[2])
     {System.out.println("Greater no is:" +a[0]);}
   else
     {System.out.println("Greater no is:" +a[2]);}
}
else
{
   if(a[1]>a[2])
      {System.out.println("Greater no is:" +a[1]);}
   else
      {System.out.println("Greater no is:" +a[2]);}
}
}
}