package view;

import pigController.PigController;
import service.ContinueService;
import serviceImpl.ContinueServiceImpl;

import java.util.*;

public class StateView {
    public static void stateMain() {
        Scanner sc = new Scanner(System.in);
        PigController contller = new PigController();

        System.out.println("");

        System.out.println(contller.showState());

        System.out.println("0번 준비하러 돌아가기");

        while (sc.nextInt()!=0){
            if(true){
                ReadyView.readyMain();
                break;
            }else {
                System.out.println("잘못입력되었습니다.");
            }
        }




    }
}
