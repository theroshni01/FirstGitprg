package Roshni;

public class Fibonaci 
{
	public static void main(String args[])
	{
		int a=0,b=1,c,n=10;
		//Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		for (int i=2;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
