import java.util.Scanner;

public class ArrayEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int evenCount = 0, oddCount = 0;

        
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

      
        System.out.println("Total Even Numbers: " + evenCount);
        System.out.println("Total Odd Numbers: " + oddCount);

        sc.close();
    }
}

