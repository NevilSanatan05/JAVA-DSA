// import java.util.Scanner;
// public class Prac {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int n = sc.nextInt();
//     boolean isPrime = true;
//     for(int i=2;i<=n-1;i++){
//       if(n%i==0){
//         isPrime = false;
//         break;
//       }
//     }
//     if(isPrime){
//       System.out.println(n + " is a prime number.");
//     } else {
//       System.out.println(n + " is not a prime number.");
//     }
//     sc.close();
//   }
// }

// public class Prac {
//   public static void main(String[] args) {
//     for (int i = 0; i < 5; i++) {
//       System.out.println("Hello");
//       i += 2;
//     }
//   }
// }

// import java.util.Scanner;

// public class Prac {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int number;
//     int choice;
//     int evenSum = 0;
//     int oddSum = 0;
//     do {
//       System.out.print("Enter a number :");
//       number = sc.nextInt();
//       if (number % 2 == 0) {
//         evenSum += number;
//       } else {
//         oddSum += number;
//       }
//       System.out.println("Do you want to continue ? Press 1 for yes or 0 for no");
//       choice = sc.nextInt();
//     } while (choice == 1);
//     System.out.println("Sum of even numbers: " + evenSum);
//     System.out.println("Sum of odd numbers: " + oddSum);
//     sc.close();
//   }
// }

// public class Prac {
//   public static void main(String[] args) {
//     for (int i = 0; i <= 5; i++) {
//       System.out.println("i = " + i);
//     }
//     // System.out.println("i after the loop = " + i);

//   }
// }

import java.util.Scanner;
public class Prac{
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a number: "); 
   int n = sc.nextInt(); 
   for(int i=1;i<=10;i++){
    System.out.println(n+"x"+i+"="+(i*n));
  }
  sc.close();
   }
   
}
