import java.util.Scanner;

public class StringA {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//何行か
        String s = sc.next();//フィルターの文字列
        int count = 0; //フィルダーにかからなかった回数
        for(int i=0; i < n; i++) {
            String b = sc.next();
            if(b.contains(s)) {
                System.out.println(b);//含んだ場合表示
            } else {
               count += 1;//含まない場合カウントする
            }
            if(count == n) {
             System.out.println("None");//すべてカウントされたらNoneを表示する
            }
        }
  }
}