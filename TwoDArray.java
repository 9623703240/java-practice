
import java.util.*;
public class TwoDArray {
	
	
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Rows and Col do You want");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int mat[][]=new int[r][c];
		System.out.println("Enter element in Matrix");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
			
		}
	
		
		System.out.println("matrix\n");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
}
