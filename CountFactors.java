//print count factors f 48

public class CountFactors

{

public static void main(String arg[])

{
int num=48;
int CountFactor=0;
for(int i=1;i<=48;i=i+1) // for(int i=1;i<=num;i=i+1) 
{

if(48%i==0) // if(num%i==0)
{
CountFactor=CountFactor+1;
}

}

System.out.println(CountFactor);

}

}
