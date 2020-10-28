package day7;

class Hoge {
	int n = 1;
	void foo() {
		System.out.println("n = "+ this.n);
	}
}

public class Supplement01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hoge h1 = new Hoge();
		Hoge h2 = h1;
		h1.n = 3;
		h2.foo();
		//Hoge h = null;

		//h.n = 1;
		//h.foo();

	}

}
