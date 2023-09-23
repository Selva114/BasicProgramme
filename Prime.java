public class Prime
{
public static void main(String args[])
{
//Optimized cde for prime number

int num=17;
boolean flag=false;
for(int i=2;i<num/2;i=i+1)
{
if(num%i==0)
{
flag=false;
break;
}
}
if(flag)
{
System.out.println("Not a prime number");
}

else
{
System.out.println("prime number");
}
}
}
