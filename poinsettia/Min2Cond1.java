import java.util.Scanner;

public class Min2Cond1 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("整数a: ");
    int a = stdIn.nextInt();
    System.out.println("整数b: ");
    int b = stdIn.nextInt();

    int min = a < b ? a : b;//小さい方の値を出す？
    System.out.println("小さいのは" + min + "です。");
  }
}