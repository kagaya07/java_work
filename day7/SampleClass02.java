package day7;

public class SampleClass02 {

	public SampleClass02() {
		System.out.println("コンストラクタ");
	}

	private void method1() {
		System.out.println("method(private)");
	}

	public void method2() {
		System.out.println("method(public)");
	}

	public void method3() {
		method1();
		System.out.println("method(public) : num="+ this.num );
	}

	private int num = 1;
}
