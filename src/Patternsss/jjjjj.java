package Patternsss;
import java.util.Scanner;
public class jjjjj
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the no...");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1||j==n/2+1||(i==n&&j<=n/2+1))
				System.out.print("* ");
			else 
				System.out.print("  ");
		}
		System.out.println();
	}
}
}