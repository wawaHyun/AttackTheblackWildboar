package view;

import java.util.Scanner;

public class DelReadyView {
    public static void readyMain() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you ready to fight the PIG?");
        System.out.println("0-back main, 1-state, 2-fight the pig!!");

        switch (sc.next()){
            case "0" : {
                return;
            }
            case "1" :{
                DelStateView.stateMain();
                break;
            }
            case "2" : {
                PigView.pigMain(sc);
                break;
            }
        }


    }
}
