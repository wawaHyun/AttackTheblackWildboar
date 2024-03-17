package ready;

import model.Player;

import java.util.Map;
import java.util.Scanner;

public class ReadyController {
    private static ReadyController instance = new ReadyController();
    ReadyService ready;

    public ReadyController(ReadyService ready) {
        this.ready = ready;
    }

    public static ReadyController getInstance() {
        return instance;
    }

    public Map<String, Player> jobMap() {
        return ready.jobMap();
    }

    public String jobSelectMap(Scanner sc) {
        return ready.jobSelectMap(sc.nextInt());
    }

    public String jobSelectLiSt(Scanner sc) {
        int scc = sc.nextInt();
        switch (scc){
            case 0 :
                ready.jobSelectLiSt(Player.builder()
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
                ready.jobSelectLiSt(Player.builder()
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
                ready.jobSelectLiSt(Player.builder()
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
        return ready.showState();
    }
    public String AttackPig() {
        int pig = 50;
        return "";
    }

    public String start() {
        return ready.start();
    }
}


