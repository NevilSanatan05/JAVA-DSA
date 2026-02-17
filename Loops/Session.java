// public class Session{
//   public static void main(String[] args) {
//     for (int i = 0; i < 5; i++) {
//       System.out.println("Hello");
//       i+=2;
//     }
//   }
// }

import java.util.Scanner;
public class Session{
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the set of integers : ");
    int n = sc.nextInt();
    int evenSum = 0;
    int oddSum = 0;
    int TotalSum = 0;
    for(int i=1;i<=n;i++){
      System.out.print("Enter the integer " + i + " : ");
      int num = sc.nextInt();
      if(num%2==0){
        evenSum += num;
      }
      else{
        oddSum += num;
      }
    }
    TotalSum = evenSum + oddSum;
    System.out.println("Even sum: " + evenSum);
    System.out.println("Odd sum: " + oddSum);
    System.out.println("Total sum: " + TotalSum);
      
  }
}