package sample;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1; i <= 9; i++) {
            if(i==9) {
                System.out.print(a * i);
            }else {
                System.out.print(a * i +" ");
            }
        }
        System.out.println();
	}

}
