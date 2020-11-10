import java.util.Scanner;

public class Max3 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("整数a: "); int a = stdIn.nextInt();
    System.out.println("整数b: "); int b = stdIn.nextInt();
    System.out.println("整数c: "); int c = stdIn.nextInt();

    int max = a;
    if(b > max) max = b;
    if(c > max) max = c;

    System.out.println("最大値は" + max + "です。");
  }
}