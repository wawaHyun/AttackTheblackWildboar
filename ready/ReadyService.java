package ready;

import model.Player;

import java.util.Map;

public interface ReadyService {
    String start();
    Map<String, Player> jobMap();
    String jobSelectMap(int playerNum);
    String jobSelectLiSt(Player playerNum);
    String showState();
}
