import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ch, n = 0;
        int arr[] = new int[20];

        do {
            System.out.println("\n1-Create Array");
            System.out.println("2-Display Array");
            System.out.println("3-Reverse Array");
            System.out.println("4-Search Element");
            System.out.println("5-Insert Element");
            System.out.println("Enter Your Choice");

            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.println("How many numbers?");
                    n = sc.nextInt();

                    System.out.println("Enter elements:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    break;

                case 2:
                    System.out.println("Array elements:");
                    for (int i = 0; i < n; i++) {
                        System.out.println(arr[i]);
                    }
                    break;

                case 3:
                    System.out.println("Reverse order:");
                    for (int i = n - 1; i >= 0; i--) {
                        System.out.println(arr[i]);
                    }
                    break;

                case 4:
                    System.out.println("Enter element to search:");
                    int search = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] == search) {
                            System.out.println("Element found at position " + (i + 1));
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Element not found");
                    }
                    break;

                case 5:
                    System.out.println("Enter new value and position:");
                    int newval = sc.nextInt();
                    int loc = sc.nextInt();

                    for (int i = n - 1; i >= loc - 1; i--) {
                        arr[i + 1] = arr[i];
                    }
                    arr[loc - 1] = newval;
                    n++;
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            System.out.println("Do you want to continue? Press 1");
            ch = sc.nextInt();

        } while (ch == 1);

        sc.close();
    }
}
																																						