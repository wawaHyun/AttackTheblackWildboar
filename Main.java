import controller.ReadyController;
import view.ReadyView;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("You are so, so hungry...\n" +
                "Let's ATTACK PIGGG! yammy yummmmy pig!");
        System.out.println();
        ReadyController cotnroll = new ReadyController();

        System.out.println("Choose your job.");
        System.out.println("0-warrior, 1-tanker, 2-adventurer");
        cotnroll.jobMap();
        cotnroll.jobSelectMap(sc);

        System.out.println("Let's ATTACK PIGGG! yammy yummmmy pig!");

        System.out.println("input 'start'");
        if (sc.next().equals("start")) ReadyView.readyMain();


    }
}