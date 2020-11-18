import java.util.Scanner;

public class Test01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("適当な数字を入れてください");
    int number = sc.nextInt();
    String a = "*";

    for(int i=0; i < number; i++) {
      System.out.println(a);
      a += "*";
    }
  }
}