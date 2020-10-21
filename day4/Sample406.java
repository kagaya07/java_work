package day4;

public class Sample406 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("６がでたら終了");
		//無限ループ
		while(true) {
			int dice = (int)(Math.random() * 6)+1;
			System.out.println(dice);
			if(dice == 6) {
				break;//ループから抜ける
			}
		}
		System.out.println("終了");

	}

}
