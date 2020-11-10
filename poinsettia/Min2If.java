import java.util.Scanner;

public class Min2If {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("整数a: ");
    int a = stdIn.nextInt();
    System.out.println("整数b: ");
    int b = stdIn.nextInt();

    int min;
    if(a < b){
      min = a;
    }
    else{
      min = b;
    }

    System.out.println("小さいのは" + min + "です。");

  }
}