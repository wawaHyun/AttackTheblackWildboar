package ready;

import model.Player;

import java.util.Map;
import java.util.Scanner;

public interface ReadyService {
    String start();
    Map<String, Player> jobMap();
    String jobSelectMap(int playerNum);
    String jobSelectLiSt(Player playerNum);
    String showState();

    String jobSelect(Scanner sc);
}
