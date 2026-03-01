//Arrays Session

// public class session_5 {
//   public static void main(String[] args) {
//     int numbers[] = { 2, 4, 5 };
//     for (int i = 0; i < numbers.length; i++) {
//       System.out.println(numbers[i]);
//     }
//   }
// }

// import java.util.Scanner;

// public class session_5 {

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the size of array:");
//     int n = sc.nextInt();

//     int[] arr = new int[n]; // array creation

//     System.out.println("Enter " + n + " elements:");

//     for (int i = 0; i < n; i++) {
//       arr[i] = sc.nextInt();
//     }

//     System.out.println("Array elements are:");
//     for (int i = 0; i < n; i++) {
//       System.out.print(arr[i] + " ");
//     }

//     sc.close();
//   }
// }

// import java.util.Scanner;
// public class session_5 {
//   public static void main(String[] args) {
//     int[] arr = {4,9,10,7,9};
//     for(int i=0;i<arr.length;i++){
//       int first = arr[i];
//       for(int j=i+1;j<arr.length;j++){
//         int second = arr[j];
//         System.out.println("Making pair of " + first + " and " + second);
//       }
//     }
//   }
// }

// import java.util.Scanner;

// public class session_5 {
//   public static void main(String[] args) {
//     int[] arr = { 4, 9, 10, 7, 9 };
//     for (int i = 0; i < arr.length; i++) {
//       int first = i;
//       for (int j = i; j < arr.length; j++) {
//         int second = j;
//         System.out.println("Start idx is  " + first + " and End idx is " + second);
//         for (int k = first; k <= second; k++) {
//           System.out.print(arr[k] + " ");
//         }
//         System.out.println();
//       }
//     }
//   }
// }

import java.util.Scanner;

public class session_5 {

  public static boolean binSearch(int arr[], int find) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      System.out.println("Start = " + start + ", End = " + end + ", Mid = " + mid );
      if (arr[mid] == find) {
        return true;
      } else if (arr[mid] < find) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] arr = { 1,2,3,4,5,6,7};
    if(binSearch(arr,3)){
      System.out.println("Element Found");
    }
    else{
      System.out.println("Element not Found");
    }
  }
}