public class factor
{
public static void main(String args[])
{

int num=48;

for(int i=2;i<=num/2;i=i+1)
{
if(num%i==0)
{
System.out.println(i);
}
}
}
}
