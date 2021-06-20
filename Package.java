class Methods
{
 public void add(int a, int b)
{
System.out.println("Sum is :" +(a+b));
}
public void sub(int a, int b)
{
System.out.println("Sub is :" +(a-b));
}
public void mul(int a, int b)
{
System.out.println("Mul is :" +(a*b));
}
public void div(int a, int b)
{
System.out.println("Div is :" +(a/b));
}
}
public class Package
{
public static void main(String []args)
{
 Methods md = new Methods();
 md.add(4,5);
 md.sub(5,3);
 md.mul(2,3);
 md.div(4,2);
}
}