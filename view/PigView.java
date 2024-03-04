package view;

import java.util.Scanner;

public class PigView {
    public static void pigMain(Scanner sc) {
        System.out.println("     __   __");
        System.out.println("     \\/---\\/");
        System.out.println("      ). .(");
        System.out.println("     ( (\") )");
        System.out.println("      )   (");
        System.out.println("     /     \\");
        System.out.println("    (       )");
        System.out.println("   ( \\ /-\\ / )");
        System.out.println("    w'W   W'w");

        System.out.println("PIG!!!!");
        System.out.println("Chubby pig has appeared!\n" +
                "Gulp! Gulp!\n");

        //돼지공격
        //아이템줍기

        System.out.println("goodjob! pig is down!\nyami yami yamyami~!\noh!\nSuccessfully leveled up!" +
                "go back to Ready. Please input 'ready'.\n");
        while (true){
        switch (sc.next()){
            case "ready" :
                ReadyView.readyMain();
                break;
            default:
                System.out.printf("sorry! wrong input! Please input 'ready'.\n");
        }}

    }
}
