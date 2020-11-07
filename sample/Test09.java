package sample;
import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] b = line.split("");
        for(int i=0; i < b.length; i++) {
            if (b[i].equals("A")) {
                System.out.print(4);
            }else if(b[i].equals("E")) {
                System.out.print(3);
            }else if(b[i].equals("G")) {
                System.out.print(6);
            }else if(b[i].equals("I")) {
                System.out.print(1);
            }else if(b[i].equals("O")) {
                System.out.print(0);
            }else if(b[i].equals("S")) {
                System.out.print(5);
            }else if(b[i].equals("Z")) {
                System.out.print(2);
            }else {
                System.out.print(b[i]);
            }
        }

	}

}
