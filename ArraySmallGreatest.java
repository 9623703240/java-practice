
import java.util.Scanner;

public class ArraySmallGreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];


        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

     
        int smallest = arr[0];
        int greatest = arr[0];

       
        for (int i = 1; i < 10; i++) {
            if (arr[i] < smallest)
                smallest = arr[i];

            if (arr[i] > greatest)
                greatest = arr[i];
        } 

     
        System.out.println("Smallest Number: " + smallest);
        System.out.println("Greatest Number: " + greatest);

        sc.close();
    }
}
