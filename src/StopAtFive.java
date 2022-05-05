import java.util.Scanner;

public class StopAtFive {
  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);

    while (true) {
      System.out.println("Give a number: ");
      int number = scan.nextInt();
      if (number == 5) {
        break;
      }

    }

    scan.close();
  }
}
