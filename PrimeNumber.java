//to check a giver number is prime number or not

public class PrimeNumber
{
public static void main(String args[])
{
//int num=50;

for(int num=1;num<=100;num=num+1)
{
int counter=0;
for(int i=1;i<=num;i=i+1)
{
if(num%i==0)
{
counter=counter+1;
//System.out.println(i);
}
}
if(counter==2)
{
System.out.println("its a Prime number "+ num);
}
else
{
System.out.println("its not a Prime number "+num);
}

}
}
}
