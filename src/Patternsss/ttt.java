package Patternsss;
import java.util.Scanner;
public class ttt
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
				if(j==n/2+1||i==1)
				System.out.print("* ");
			else 
				System.out.print("  ");
		}
		System.out.println();
	}
}
}