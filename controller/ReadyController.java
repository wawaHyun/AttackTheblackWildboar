package controller;

import model.Player;
import service.ContinueService;
import serviceImpl.ContinueServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class ReadyController {
    ContinueService contiune;

    public ReadyController(){
        this.contiune = ContinueServiceImpl.getInstance();
    }


    public Map<String, Player> jobMap() {
        return contiune.jobMap();
    }

    public String jobSelectMap(Scanner sc) {
        return contiune.jobSelectMap(sc.nextInt());
    }

    public String jobSelectLiSt(Scanner sc) {
        int scc = sc.nextInt();
        switch (scc){
            case 0 :
                contiune.jobSelectLiSt(Player.builder()
                        .jobSelectNum(scc)
                        .jobName("warrior")
                        .attack(70)
                        .healthPont(30)
                        .skillName("Strong Attack")
                        .skillValue(0)
                        .guiltyConscienceValue(0)
                        .build());
                break;
            case 1 :
            contiune.jobSelectLiSt(Player.builder()
                        .jobSelectNum(scc)
                        .jobName("tanker")
                        .attack(30)
                        .healthPont(70)
                        .skillName("Recover HP")
                        .skillValue(0)
                        .guiltyConscienceValue(0)
                        .build());
                break;
            case 2 :
            contiune.jobSelectLiSt(Player.builder()
                        .jobSelectNum(scc)
                        .jobName("adventurer")
                        .attack(50)
                        .healthPont(50)
                        .skillName("Attack Avoid")
                        .skillValue(0)
                        .guiltyConscienceValue(0)
                        .build());
                break;
        }
        return "";
    }

    public String showState() {
        return contiune.showState();
    }
    public String AttackPig() {
        int pig = 50;
        return "";
    }

}


