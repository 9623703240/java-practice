import java.util.Scanner;

public class Array2 {
	
	public static void main(String[]args) {
		int arr[]=null;
		int i;
		int even=0,odd=0;
		int evensum=0,oddsum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many numbers do you want in Array");
		int n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter any Number in Array");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]%2==0)
			{
				even++;
				evensum=evensum+arr[i];
			}
			else 
			{
				odd++;
				oddsum=oddsum+arr[i];
			}
			
		}
		System.out.println("Total Even Nos are: "+even+"\nand sum is :"+evensum);
		System.out.println("Total Odd Nos are: "+odd+"\nand sum is :"+oddsum);
	}

}
