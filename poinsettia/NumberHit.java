import java.util.Scanner;
import java.util.Random;

public class NumberHit {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    int no = rand.nextInt(100);

    System.out.println("数当てゲーム開始！！");
    System.out.println("0~99の数を当ててください。");

    int x;
    do {
      System.out.print("いくつかな : ");
      x = sc.nextInt();

      if(x > no) {
        System.out.println("もっと小さな数だよ。");
      } else if (x < no) {
        System.out.println("もっと大きな数だよ。");
      }
    }while(x != no);

    System.out.println("正解です！！");
  }
}

