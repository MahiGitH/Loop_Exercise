import java.util.Scanner;

public class PositiveNumbers {
  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);

    while (true) {
      System.out.println("Enter a number.");
      int num = scan.nextInt();

      if (num == 0) {
        break;
      }

      if (num < 0) {
        System.out.println("Numbers must be a positive number");
        continue;
      }

      // loop will stop here if the number is not positive

      System.out.println("Number is " + num);
    }

    scan.close();
  }
}
