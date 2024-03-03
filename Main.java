import pigController.PigController;
import service.ContinueService;
import serviceImpl.ContinueServiceImpl;
import view.ReadyView;
import view.StateView;

import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++){
            System.out.println();
            System.out.println("You are so, so hungry...\n" +
                    "Let's ATTACK PIGGG! yammy yummmmy pig!");
        }
        PigController cotnroll = new PigController();
        ContinueService contiSer = ContinueServiceImpl.getInstance();

        System.out.println("Choose your job.");
        System.out.println("0-warrior, 1-tanker, 2-adventurer");
        contiSer.jobSelect(sc.nextInt());

        for(int i=0;i<3;i++){
            System.out.println("돼지를 잡자!");
        }
        System.out.println("start 입력");
        if(sc.next().equals("start"))ReadyView.readyMain();


    }
}