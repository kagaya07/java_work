package exday5;

import java.util.ArrayList;

public class SampleEx501 {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(new Student("林蓮花",1,1));
		al.add(new Student("伊藤那月",1,2));
		al.add(new Student("小林太郎",2,3));
		al.add(new Student("薩摩門田",2,4));
		al.add(new Student("鈴木与一",3,5));

		al.remove(3);
		for(int i = 0; i < al.size(); i++) {
			Student s = (Student)al.get(i);
			System.out.println("番号：" + s.getNumber() + "　名前：" + s.getName() + "　学年：" + s.getGrade());
		}


	}

}
