package pattern1;

public class Pattern1 {

	public static void main(String[] args) 
	{
		int n=6;
		for(int i=0;i<n;i++)
		{
			//letter I
			for(int j=0;j<n;j++)
			{
			
				if(j==(n-1)/2||i==0||i==(n-1))
				{
				System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
				
			}
			System.out.print("  ");
		//letter N
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||i==j)
				{
					System.out.print("*");
				}
					else
					{
					System.out.print(" ");
					}
					
			}
			System.out.print("  ");
		//letter E
			for(int j=0;j<n;j++)
			{
				if(j==0||i==0&&j<n||i==(n-1)/2&&j<n||i==(n-1)&&j<n)
				{
					System.out.print("*");
				}
					else
					{
					System.out.print(" ");
					}
					
			}
			System.out.print("  ");
			//letter U
			for(int j=0;j<n;j++)
			{
				if(j==0&&i<(n-1)||i==(n-1)&&j!=0&&j!=(n-1)||j==(n-1)&&i<(n-1))
				{
					System.out.print("*");
				}
					else
					{
					System.out.print(" ");
					}
					
			}
			System.out.print(" ");
			
			//letter R
			for(int j=0;j<n;j++)
			{
				if(j==0||i==0&&j<n-1||j==(n-1)&&i<=(n-1)/2||i==(n-1)/2||(i==j)&&i>(n-1)/2)
				{
					System.out.print("*");
				}
					else
					{
					System.out.print(" ");
					}		
			}
			System.out.print(" ");
			
			//letter O
			for(int j=0;j<n;j++)
			{
				if(j==0&&i!=0&&i!=(n-1)||i==0&&j!=0&&j!=(n-1)||j==(n-1)&&i!=0&&i!=(n-1)||i==(n-1)&&j!=0&&j!=(n-1))
				{
					System.out.print("*");
				}
					else
					{
					System.out.print(" ");
					}		
			}
			System.out.print(" ");
			
			//letter N
			for(int j=0;j<n;j++)
			{
				if(j==0||i==j||j==(n-1))
				{
					System.out.print("*");
				}
					else
					{
					System.out.print(" ");
					}		
			}
			System.out.print(" ");
			
			
			
			
			
			System.out.println();
	}
	} 
}
		




