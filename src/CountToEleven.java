import java.util.Scanner;

public class CountToEleven {
  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number less than 11");
    int num = scan.nextInt();
    int end = 12;
    for (int i = num; i < end; i++) {

      System.out.println(i);
    }
    scan.close();
  }
}
