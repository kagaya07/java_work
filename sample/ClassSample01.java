package sample;
import java.io.File;
import java.io.IOException;

public class ClassSample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			File file = new File("src/sample/text.text");
			System.out.println(file.exists());
			System.out.println(file.createNewFile());
		} catch(IOException e) {
			System.out.println("処理に失敗しました。");
		}

	}

}
