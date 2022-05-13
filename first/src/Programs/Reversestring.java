package Programs;
import java.lang.String.*;
import java.util.Scanner;

public class Reversestring 
{
	public static void main(String[] args)
	{
		String str;
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		System.out.println("Reverse of the String is:");
		int i=str.length();
		while(i>0)
		{
			System.out.print(str.charAt(i-1));
			i--;
		}
	}

}
