import java.util.Scanner;

public class Multiplication {
  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);

    System.out.println("Input a number: ");
    int multinum = scan.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println(multinum + " * " + i + " = " + multinum * i);
    }

    scan.close();
  }
}
