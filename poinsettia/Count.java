import java.util.Scanner;

public class Count {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("カウントダウンします。");
    int x;
    do {
      System.out.print("正の整数値");
      x = sc.nextInt();
    }while(x <= 0);

    while(x >= 0) {
      System.out.println(x--);
      //xの値を表示後デクリメントする。
      //System.out.println(--x);
      //xの値をデクリメントしてから表示。
    }
  }
}