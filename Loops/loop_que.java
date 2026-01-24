import java.util.Scanner;

public class loop_que {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int n = sc.nextInt();
    int count = 0;
    while (n != 0) {
      n /= 10;
      count++;
    }
    System.out.println("The number of digit in the n are " + count);
    sc.close();
  }
}