// public class do_while_loop {
//   public static void main(String[] args) {
//     int i = 0;
//     do{
//       System.out.println(i);
//       i++;
//     }
//     while(i<5);
//   }
// }

// public class do_while_loop {
//   public static void main(String[] args) {
//     int i = 1;
//     do {
//       System.out.println(i);

//       i++;
//       if (i == 3) {
//         break;
//       }

//     } while (i < 5);
//     System.out.println("Loop ended");
//   }

// }

// import java.util.Scanner;

// public class do_while_loop {
//   public static void main(String[] args) {
//     System.out.print("Enter a number: ");
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     for (int i = 1; i <= n; i++) {
//       System.out.println(i);
//       if(i%10==0){
//         System.out.println("Its a multiple of 10");
//         break;
//       }
//     }
// sc.close();
//   }
// }

// import java.util.Scanner;

// public class do_while_loop {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     do {
//       System.out.print("Enter a number: ");
//       int n = sc.nextInt();
//       if (n % 10 == 0) {
//         System.out.println("Its a multiple of 10 , so exiting the loop");
//         break;
//       }
//     } while (true);
//     sc.close();
//   }
// }

//Continue in for loop
// import java.util.Scanner;
// public class do_while_loop {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     for (int i = 1; i <= 10; i++) {
//       if (i == 3) {
//         continue;
//       }
//       System.out.println(i);
//     }
//     sc.close();
//   }
// }


import java.util.Scanner;

public class do_while_loop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    do {
      System.out.print("Enter a number: ");
      int n = sc.nextInt();
      if (n % 10 == 0) {
        System.out.println("Its a multiple of 10 , so continuing the loop");
        continue;
      }
      System.out.println(n);
    } while (true);
    
  }
}