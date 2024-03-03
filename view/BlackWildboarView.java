package view;

import java.util.Scanner;

public class BlackWildboarView {
    public static void blackWildboarmain(Scanner sc) {
        System.out.println("        d^b _,,dddP\"\"\"\"\"\"\"Ybbb,,_ d^b");
        System.out.println("       d  ,dP\"'               `\"Yb,  b");
        System.out.println("       b,d\"                       \"b,d");
        System.out.println("       d\"        ,d\"\"YgP\"\"b,        \"b");
        System.out.println("      d'         8  o g o  8         `b");
        System.out.println("      8          d,gPPPPRg,b          8");
        System.out.println("      8          dP'     'Yb          8");
        System.out.println("      8          8)  8 8  (8          8");
        System.out.println("      Y,         Yb       dP         ,P");
        System.out.println("       Ya         \"8ggggg8\"         aP");
        System.out.println("        \"Ya         b,,,d         aP\"");
        System.out.println("         8\"Yb,_               _,dP\"8    ");
        System.out.println("         8      8YbbbbbgggddP8     8");
        System.out.println("         d      b            d     b");
        System.out.println("         \"\"\"\"\"\"               \"\"\"\"\"\"");


        System.out.println("흑돼지!!");
        System.out.println("0번 메인으로 돌아가기");
        while (true){
            if(sc.next().equals("0")){
                return;
            }else {
                System.out.println("잘못입력되었습니다.");
            }
        }
    }
}
