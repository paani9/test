package sample;


public class Bubble {
	public static void main (String[] args)
	{int[] a={20,82,11};
	int n=a.length;
	for(int i=0;i<n-1;i++)
	{for(int j=0;j<n-1;j++)
		if(a[j]>a[j+1])
		{
			int t=a[j];
			a[j]=a[j+1];
			a[j+1]=t;
		}
	}
		
	
	
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
}
}