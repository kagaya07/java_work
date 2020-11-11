import java.util.Scanner;


public class Total {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();//時間帯1 9~17
        int y = sc.nextInt();//時間帯2 17~22
        int z = sc.nextInt();//時間帯3 22~24 0~9
        int n = sc.nextInt();//出勤日数
        String p = sc.nextLine();
        int total = 0;

        for(int i=0; i < n; i++) {
            String s = sc.nextLine();
            String[] o = s.split(" ");

            int w = Integer.parseInt(o[0]);
            //System.out.print(w + " ");
            int q = Integer.parseInt(o[1]);
            //System.out.println(q);

            if(w < q) {
                for(int m=w+1; m <= q; m++) {
                    if(m > 0 && m <= 9) {
                        total += z;
                        //System.out.println(m + " "+ total + " ");
                    }else if(m > 17 && m <= 22) {
                        total += y;
                        //System.out.println(m + " "+ total + " ");
                    }else if(m > 22 && m <= 24) {
                        total += z;
                        //System.out.println(m + " "+ total + " ");
                    }else if(m > 9 && m <= 17) {
                        total += x;
                        //System.out.println(m + " "+ total + " ");
                    }
                }
            }else {
                for(int l=w+1; l <= 24; l++) {
                    if(l > 9 && l <= 17) {
                        total += x;
                    }else if(l > 17 && l <= 22) {
                        total += y;
                    }else if(l > 22 && l <= 24) {
                        total += z;
                    }else if(l > 0 && l <= 9) {
                        total += z;
                    }
                }
                for(int t=0+1; t <= q; t++) {
                    if(t >=9 && t <= 17) {
                        total += x;
                        //System.out.print(total);
                    }else if(t > 17 && t <= 22) {
                        total += y;
                        //System.out.print(total);
                    }else if(t > 22 && t <= 24) {
                        total += z;
                        //System.out.print(total);
                    }else if(t > 0 && t <= 9) {
                        total += z;
                        //System.out.print(total);
                    }
                }
            }
            //System.out.println();
        }
        System.out.println(total);
    }
}