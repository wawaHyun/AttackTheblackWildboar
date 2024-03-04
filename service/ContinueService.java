package service;

import model.Player;

import java.util.*;

public interface ContinueService {
    Map<String, Player> jobMap();
    String jobSelectMap(int playerNum);
    String jobSelectLiSt(Player playerNum);
    String showState();

}
