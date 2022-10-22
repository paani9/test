package sample;

public class primenum 
{public static void main(String[] args)
	{

for(int i=1;i<100;i++)
	{for(int j=2;j<i;j++)
{  if((i%2==0)||(i%3==0)||(i%5==0)||(i%7==0))
{
	break;
}
else
{
	System.out.println(i);
	break;
}
}
}
}
}
