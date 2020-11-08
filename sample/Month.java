
import java.util.Scanner;

public class Month {
  public static void main(String[] args) {
    Scanner math = new Scanner(System.in);

    System.out.println("季節を求めます。\n何月ですか？");
    int month = math.nextInt();

    if(month >= 3 && month <= 5) {
      System.out.println(month + "月は春です。");
    }else if(month >= 6 && month <= 8) {
      System.out.println(month + "月は、夏です。");
    }else if(month >= 9 && month <= 11) {
      System.out.println(month + "月は、秋です。");
    }else if(month == 12 || month == 1 || month == 2) {
      System.out.println(month + "月は、冬です。");
    }
  }
}