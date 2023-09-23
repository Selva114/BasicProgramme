public class counter
{
public static void main(String args[])
{
int counter=0;
int num=8;
for(int i=1;i<=100;i=i+1)
{
if(i%num==0)
{
counter=counter+1;
}
}
System.out.println(counter);
}
}
