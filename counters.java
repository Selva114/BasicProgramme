public class counters
{
public static void main(String args[])
{
int counters=0;
int num=15;
for (int i=1;i<=100;i=i+1)
{
if(i%num==0)
{
counters=counters+1;

}
}
System.out.println(counters);
}

}
