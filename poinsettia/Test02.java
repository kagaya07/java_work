import java.util.Scanner;

public class Test02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("二番目に大きな整数を出します。整数を４つ入れてください。");
    int a[] = new int[4];
    for(int i=0; i < 4; i++) {
        a[i] = sc.nextInt();
    }

    int one,two,three,foo;

    if(a[0] >= a[1]) {
        one = a[0];
        two = a[1];
    }else {
        one = a[1];
        two = a[0];
    }

    if(a[2] >= a[3]) {
        three = a[2];
        foo = a[3];
    }else {
        three = a[3];
        foo = a[2];
    }

    //System.out.println(one + two + three + foo);

    if(one >= three) {
      if(two >= three) {
        System.out.println(two);
      } else {
        System.out.println(three);
      }
    } else {
      if(one >= foo) {
        System.out.println(one);
      } else {
        System.out.println(foo);
      }
    }
  }
}