import java.util.Scanner;

public class InputDemo{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double r = sc.nextDouble();   // fixed
    double a = 3.142 * r * r;
    System.out.println(a);
    sc.close();
  }
}
