package view;

import ready.ReadyController;

import java.util.*;

public class StateView {
    public static void stateMain() {
        Scanner sc = new Scanner(System.in);
//        ReadyController contller = new ReadyController();

        System.out.println("");

//        contller.showState();

        System.out.println("0번 ready for pig attack.");

        while (sc.nextInt()!=0){
            if(true){
                ReadyView.readyMain();
                break;
            }else {
                System.out.println("");
            }
        }




    }
}
