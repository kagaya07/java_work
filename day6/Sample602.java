package day6;

public class Sample602 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SampleClass01 s1,s2,s3;
		s1 = new SampleClass01();
		s2 = new SampleClass01();
		s3 = new SampleClass01();
		s1.n = 100;
		s2.n = 200;
		s3.n = 300;
		s1.a = "ABC";
		s2.a = "あいう";
		s3.a = "123";
		System.out.println(s1.add("DEF"));
		System.out.println(s2.add("えお"));
		System.out.println(s3.add("456"));
		s1.showNum();
		s2.showNum();
		s3.showNum();

	}

}
