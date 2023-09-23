//print odd number which are multiple of 7

public class Oddnumber
{
public static void main(String args[])
{

int num=100;
int div=7;
for(int i=1;i<=num;i=i+1)
    {

        if(i%div==0 && i%2!=0)
               {
                 System.out.println(i);
               } 

      }
}
}
