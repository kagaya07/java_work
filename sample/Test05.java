package sample;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int i = x / a * b;
        int n = i - x + x % a;

        System.out.println(n);

	}

}
