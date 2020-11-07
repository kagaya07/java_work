package sample;
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i < n; i++) {
            String a = sc.next();
            int b = sc.nextInt();
            System.out.println(a + " " + (b + 1) );
        }
        
        
	}

}
