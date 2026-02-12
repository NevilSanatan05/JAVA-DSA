// public class while_loop {
//     public static void main(String[] args) {
//         int i = 1;
//         while (i<=10) {
//           System.out.println(i);
//           i++;

//         }
//     }
// }

// import java.util.Scanner;

// public class while_loop {
//   public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int n = sc.nextInt();
//     int i = 1;
//     while (i <= n) {
//       System.out.println(i);
//       i++;
//     }
//     sc.close();
//   }
// }

import java.util.Scanner;

public class while_loop {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int i = 1;
    int sum = 0;
    while (i <= n) {
      sum = sum + i;
      i++;

    }
    System.out.println(sum);
    sc.close();
  }
}