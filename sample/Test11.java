package sample;
import java.util.*;

public class Test11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i < n; i++) {
            String a = sc.next();
            String[] b = a.split("");
            System.out.println(b.length);
        }

	}

}
