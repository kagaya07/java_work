package sample;
import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String[] c = b.split("");
        int d = 0;
        for(int i=0; i< c.length; i++) {
            if(c[i].equals(a)) {
                d += 1;
            }
        }
        if(d > 0) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }


	}

}
