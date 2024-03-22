package ready;

import model.Player;

import java.util.Map;

public interface ReadyService {
    String start();
    String jobSelect(int playerNum);
    String showState();
}
