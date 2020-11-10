import java.util.Scanner;

public class Zyannkenn1 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("手を選べ（0・・・グー/1・・・チョキ/2・・・パー)");
    int hand = stdIn.nextInt();

    if(hand == 0) {
      System.out.println("グー");
    } else if(hand == 1) {
      System.out.println("チョキ");
    }  else if(hand == 2) {
      System.out.println("パー");
    }
  }
}