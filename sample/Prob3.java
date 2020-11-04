package sample;

public class Prob3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = (int)(Math.random() * 10)+1;
		System.out.println(a);
		if(a >= 5) {
			System.out.println("5以上です。");
		}

		int b = (int)(Math.random() * 100) + 1;
		System.out.println("b ="+ b);
		if(b%2==0 && b%3==0) {
			System.out.println("2と3の公倍数です。");
		} else if(b%2==0){
			System.out.println("2の倍数です。");
		} else if(b%3==0) {
			System.out.println("3の倍数です。");
		} else {
			System.out.println("どれにも当てはまりません");
		}
		}


	}

