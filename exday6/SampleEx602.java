package exday6;
import java.util.HashSet;

public class SampleEx602 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		HashSet<String> hs = new HashSet<String>();

		hs.add("佐藤大地");
		hs.add("佐藤大地");
		hs.add("小林健永");
		hs.add("加藤舞子");
		hs.add("東海林ゆかり");
		hs.add("東海林ゆかり");

		for(String h : hs) {
			System.out.println(h);
		}

	}

}
