//Arrays Session

// public class session_5 {
//   public static void main(String[] args) {
//     int numbers[] = { 2, 4, 5 };
//     for (int i = 0; i < numbers.length; i++) {
//       System.out.println(numbers[i]);
//     }
//   }
// }


import java.util.Scanner;

public class session_5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of array:");
    int n = sc.nextInt();

    int[] arr = new int[n];   // array creation

    System.out.println("Enter " + n + " elements:");

    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }

    System.out.println("Array elements are:");
    for(int i = 0; i < n; i++){
        System.out.print(arr[i] + " ");
    }

    sc.close();
  }
}