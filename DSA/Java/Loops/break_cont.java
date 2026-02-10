// public class break_cont {
//   public static void main(String[] args) {
//     for (int i = 1; i <= 10; i++) {
//       if (i == 8) {
//         break;
//       }
//       System.out.println(i);
//     }
//   }
// }

// public class break_cont {
//   public static void main(String[] args) {
//     for (int i = 1; i <= 10; i++) {
//       if (i == 8) {
//         continue;
//       }
//       System.out.print(i+" ");
//     }
//   }
// }

//Composite number or not
import java.util.Scanner;

public class break_cont {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    for (int i = 2; i <= n - 1; i++) {
      if (n % i == 0 ) {
        System.out.println("Composite number");
        break;
      }
      else{
        System.out.println("Prime Number");
      }
    }
    sc.close();
  }
}
