package Patternsss;
import java.util.Scanner;
public class vvv
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
				if((j==1&&i<=n/2+1)||(j==n&&i<=n/2+1)||(i-j==n-3&&j<=n/2+1)||(i+j==n+3&&j>=n/2+1))
				System.out.print("* ");
			else 
				System.out.print("  ");
		}
		System.out.println();
	}
}
}