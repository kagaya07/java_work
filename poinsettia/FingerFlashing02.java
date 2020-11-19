import java.util.Scanner;
import java.util.HashMap;

public class FingerFlashing02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int hand;
    int b;
    HashMap<Integer,String> map = new HashMap<Integer,String>();
    map.put(0,"グー");
    map.put(1,"チョキ");
    map.put(2,"パー");

    do {
      int a = (int)(Math.random() * 3 + 0);
    do {
      System.out.print("ジャンケンぽん！！( 0...グー/ 1...チョキ/ 2...パー ) : ");
        hand = sc.nextInt();
      }while(hand < 0 || hand >2);

      if(hand == a) {
        System.out.println("相手は" + map.get(a) + "おあいこ！");
      } else if(hand == 0 && a == 1) {
        System.out.println("相手は" + map.get(a) + "あなたの勝ち！");
      } else if(hand == 0 && a == 2) {
        System.out.println("相手は" + map.get(a) + "あなたの負け！");
      } else if(hand == 1 && a == 2) {
        System.out.println("相手は" + map.get(a) + "あなたの勝ち！");
      } else if(hand == 1 && a == 0) {
        System.out.println("相手は" + map.get(a) + "あなたの負け！");
      } else if(hand == 2 && a == 0) {
        System.out.println("相手は" + map.get(a) + "あなたの勝ち！");
      } else if(hand == 2 && a == 1) {
        System.out.println("相手は" + map.get(a) + "あなたの負け！");
      }
      System.out.println();
      System.out.print("もう一度やりますか？( 0 ... Yes / 1 ... No) : ");
      b = sc.nextInt();
    }while(b == 0);
  }
}