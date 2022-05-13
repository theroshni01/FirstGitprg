package Programs;
import java.util.Scanner;
import java.util.Scanner.*;
public class Table 
{
	public static void main(String args[])
	{
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			int b=a*i;
			System.out.println(a+"*"+i+"="+b);
		}
	}

}
