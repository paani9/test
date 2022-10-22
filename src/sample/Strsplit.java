package sample;

public class Strsplit {
	public static void main(String[] args)
	{
		String s="My name is pavani";
		String[] r=s.split(" ");
		String rev="";
		String rs="";
		
		for(int i=r.length-1;i>=0;i--)
		{
			if(i==2)
			{ String t=r[i];
				for(int j=t.length()-1;j>=0;j--)
				{

					rev=rev+t.charAt(j);
			
					System.out.print(rev);
				}
				
		}
		else
		{
		System.out.print(" "+r[i]);
		
	}

}
	}
}
