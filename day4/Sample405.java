package day4;

public class Sample405 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i,num;
		num = 1;
		System.out.print("whileで実行");
		i = 1;
		while(i < num) {
			System.out.print("*");
			i++;
		}
		System.out.println();
		System.out.print("do~whileで実行");
		i = 1;
		do {
			System.out.print("*");
			i++;
		}while (i < num);

	}

}
