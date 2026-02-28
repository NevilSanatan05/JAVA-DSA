// public class session_3{
//   public static int printing(int a,int b){
//     return a+b;
//   }
//   public static void main(String[] args) {

//    int a = printing(2,3);
//    System.out.println(a);
//   }
// }

// import java.util.Scanner;

// public class session_3 {
//   public static boolean isEven(int num) {
//     return num % 2 == 0;
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a number : ");
//     int num = sc.nextInt();
//     if (isEven(num)) {
//       System.out.println(num + " is Even");
//     } else {
//       System.out.println(num + " is Odd");
//     }
//     sc.close();
//   }

// }

// import java.util.Scanner;

// public class session_3 {
// public static boolean isEven(int num) {

// if (num % 2 == 0)
// return true;
// else
// return false;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number : ");
// int num = sc.nextInt();
// boolean result = isEven(num);
// System.out.println(result);
// }
// }

//Palindrome

// import java.util.Scanner;

// public class session_3 {

//   public static boolean isPalindrome(int num) {
//     int original = num;
//     int reversed = 0;
//     while (num > 0) {
//       int digit = num % 10;
//       reversed = reversed * 10 + digit;
//       num = num / 10;
//     }
//     return original == reversed;
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a number : ");
//     int num = sc.nextInt();
//     if (isPalindrome(num)) {
//       System.out.println(num + " is a palindrome");
//     } else {
//       System.out.println(num + " is not a palindrome");
//     }
//   }
// }

//sum of digit
// public class session_3 {
//   public static int Sum(int num) {
//     int sum = 0;
//     while (num > 0) {

//       int rev = num % 10;
//       sum = sum + rev;
//       num = num / 10;
//     }
//     return sum;
//   }

//   public static void main(String[] args) {
//     int num = 532;
//     int result = Sum(num);
//     System.out.println(result);
//   }

// }


