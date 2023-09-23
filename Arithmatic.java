public class Arithmatic
{


int add(int a,int b)
{
int c=a+b;
System.out.println(c);
return c;
}

int sub(int a,int b)
{
int c=a-b;
System.out.println(c);
return c;
}

int multi(int a,int b)
{
int c=a*b;
System.out.println(c);
return c;
}

int div(int a,int b)
{
int c=a/b;
System.out.println(c);
return c;
}

public static void main(String args[])
{
Arithmatic arithmatic=new Arithmatic();
arithmatic.add(7,6);
arithmatic.sub(7,6);
arithmatic.multi(7,6);
arithmatic.div(7,6);

}

}
