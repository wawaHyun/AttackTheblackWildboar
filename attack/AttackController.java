package attack;

import java.util.Scanner;

public class AttackController {

    AttackService attack;

    public AttackController() {
        this.attack = AttackServiceImpl.getInstance();
    }

    public String AttackPig(Scanner sc) {
        System.out.println("input 'attack'! get the pig!");
//        if(sc.next().equals("attack")) {}
        return attack.AttackPig();
    }

    public String dropItem() {
        return attack.dropItem();
    }

    public String resetStats() {
        return attack.resetStats();
    }
}
