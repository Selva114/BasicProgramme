//to check a number is Perfect number or not

//perfect number mean given number == sum of factors of gien number

//this is copy from PrimeNumber programe

public class PerfectNumber
{
public static void main(String args[])
{
//int num=1000000;

for(int num=1;num<=100000;num=num+1)
{
int sum=0;
for(int i=1;i<=num/2;i=i+1)
{
if(num%i==0)
{
sum=sum+i;
//System.out.println(i);
}
}
if(num==sum)
{
System.out.println("its a Perfect number "+ num);
}
/*else
{
System.out.println("its not a Perfect number "+num);
}
*/

}
}
}

