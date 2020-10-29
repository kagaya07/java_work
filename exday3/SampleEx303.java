package exday3;

public class SampleEx303 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Bird1 b[] = new Bird1[2];

		b[0] = new Crow2();
		b[1] = new Sparrow2();

		for (int i = 0; b.length > i; i++) {
			System.out.print(b[i].getName() + " : ");
			b[i].sing();
		}



	}

}
