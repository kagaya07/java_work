import java.util.Scanner;

public class Reverser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("キーボードから何か入力してみてください");
            while (s.hasNext()) {
                String value = s.next();
                System.out.println(new StringBuilder(value).reverse());
            }
        } finally {
            s.close();
        }
    }
}