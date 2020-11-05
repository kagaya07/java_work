package sample;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
        int[] b = new int[2];
        for(int i=0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        if(b[0] % 2 + b[1] % 2 == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

	}

}
