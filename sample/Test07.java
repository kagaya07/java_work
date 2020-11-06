package sample;
import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int a = line.length();
        for(int i=0; i < a+2; i++) {
            System.out.print("+");
        }
        System.out.println();
        System.out.println("+"+ line +"+");
        for(int i=0; i < a+2; i++) {
            System.out.print("+");
        }
       System.out.println();

	}

}
