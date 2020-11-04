package sample;
import java.io.File;

public class ClassSample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		File fi = new File("src/sample");
		File[] fiList = fi.listFiles();
		System.out.println("指定したファイルは" + fi.getAbsolutePath() + "です。");
		for(int i = 0; i < fiList.length ; i++ ) {
			if(fiList[i].isFile() == true) {
				System.out.println("ファイル名は" + fiList[i].getName() + "です。");
			} else if(fiList[i].isDirectory() == true) {
				System.out.println("ディレクトリは" + fiList[i].getName() + "です。");
			}
		}


	}

}
