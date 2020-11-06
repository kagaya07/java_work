package sample;
import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] a = new String[n];
        for(int i=0; i < n; i++) {
            a[i] = sc.next();
            System.out.println(a[i]);
        }
        for(int j=0; j < n; j++) {
            String[] b = a[j].split("");
            System.out.print(b[0]);
        }


	}

}
