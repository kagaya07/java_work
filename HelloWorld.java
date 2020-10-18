public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello world");

    int number = (int)(Math.random() * 10 + 1);
    if (number < 5) {
      System.out.println("エミリアたん");
    } else if (number == 5) {
      System.out.println("レム");
    } else {
      System.out.println("ベア子");
    }
  }
}