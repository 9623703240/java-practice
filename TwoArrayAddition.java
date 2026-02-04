
import java.util.*;
public class TwoArrayAddition {

	public static void main(String[] args) {
		
		

		        Scanner sc = new Scanner(System.in);
		        System.out.println("How Many Rows and Col do You want");
		        int r = sc.nextInt();
		        int c = sc.nextInt();
		        int mat[][] = new int[r][c];
		        
		        
		        System.out.println("Enter elements in Matrix 1:");
		        for (int i = 0; i < mat.length; i++) {
		            for (int j = 0; j < mat[i].length; j++) {
		                mat[i][j] = sc.nextInt();
		            }
		        }

		       
		        System.out.println("Matrix 1:");
		        for (int i = 0; i < mat.length; i++) {
		            for (int j = 0; j < mat[i].length; j++) {
		                System.out.print(mat[i][j] + "\t");
		            }
		            System.out.println();
		        }

		     
		        int mat2[][] = new int[r][c];
		        System.out.println("Enter elements in Matrix 2:");
		        for (int i = 0; i < mat2.length; i++) {
		            for (int j = 0; j < mat2[i].length; j++) {
		                mat2[i][j] = sc.nextInt();
		            }
		        }

		       
		        System.out.println("Matrix 2:");
		        for (int i = 0; i < mat2.length; i++) {
		            for (int j = 0; j < mat2[i].length; j++) {
		                System.out.print(mat2[i][j] + "\t");
		            }
		            System.out.println();
		        }

		       
		        int sum[][] = new int[r][c];
		        for (int i = 0; i < r; i++) {
		            for (int j = 0; j < c; j++) {
		                sum[i][j] = mat[i][j] + mat2[i][j];
		            }
		        }

		    
		        System.out.println("Sum of Matrix 1 and Matrix 2:");
		        for (int i = 0; i < sum.length; i++) {
		            for (int j = 0; j < sum[i].length; j++) {
		                System.out.print(sum[i][j] + "\t");
		            }
		            System.out.println();
		        }

		        sc.close();
		    
		}


	}

                                  
