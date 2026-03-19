// public class operator {
//   public static void main(String[] args) {
//     System.out.println(5&6);  //AND
//     System.out.println(5|6); //OR
//     System.out.println(5^6); // ZOR 
//     System.out.println((~5)); // One complement
//     System.out.println(5<<2);
//     System.out.println(5>>2);
//   }
// }

public class Operator {

  public static void oddOrEven(int n) {
    int bitMask = 1;
    if ((n & bitMask) == 0) {
      System.out.println("Even number");
    } else {
      System.out.println("Odd number");
    }
  }

  public static void main(String[] args) {
    oddOrEven(3);
    oddOrEven(11);
    oddOrEven(14);
  }
}