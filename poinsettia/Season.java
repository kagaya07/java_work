import java.util.Scanner;

public class Season {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("季節を求めます。\n何月ですか？");
    int month = sc.nextInt();

    String season = switch(month) {
      case 3,4,5 -> "春";
      case 6,7,8 -> "夏";
      case 9,10,11 -> "秋";
      case 12,1,2 -> "冬";
      default    -> "不明";
    };

    System.out.println("季節は" + season + "です。");
  }
}