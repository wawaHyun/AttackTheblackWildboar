package ready;

import model.Player;

import java.util.Map;
import java.util.Scanner;

public class ReadyController {
    private static ReadyController instance = new ReadyController();
    ReadyService ready;

    public ReadyController() {
        this.ready = ReadyServiceImpl.getInstance();
    }

    public static ReadyController getInstance() {
        return instance;
    }

    public String start() {
        return ready.start();
    }

    public String jobSelect(Scanner sc) {
        System.out.println("Choose your job.");
        System.out.println("0-warrior, 1-tanker, 2-adventurer");
        return ready.jobSelect(sc.nextInt());
    }
    public String showState() {
        return ready.showState();
    }

}


