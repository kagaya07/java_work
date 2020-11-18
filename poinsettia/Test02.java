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

    if(a[2] >= one) {
      three = two;
      two = one;
      one = a[2];
    } else if(a[2] < two && a[2] < one) {
      three = a[2];
    } else if(a[2] < one && a[2] >= two) {
      three = two;
      two = a[2];
    }

    if(a[3] >= one) {
      foo = three;
      three = two;
      two = one;
      one = a[3];
    } else if(a[3] < two && a[3] < one) {
      three = a[2];
    } else if(a[2] < one && a[2] >= two) {
      three = two;
      two = a[2];
    } else if(a[3] )
  }
}