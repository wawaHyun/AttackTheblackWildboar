package ready;

import model.Player;
import view.DelReadyView;

import java.util.*;

public class ReadyServiceImpl implements ReadyService{
    private static ReadyService instance = new ReadyServiceImpl();
    Map<String, Player> playerMap;

    public ReadyServiceImpl() {
    }

    public static ReadyService getInstance() {
        return instance;
    }

    @Override
    public String start() {
        System.out.println("You are so, so hungry...\n" +
                "Let's ATTACK PIGGG! yammy yummmmy pig!\n");
        return "Let's go to ATTACK PIGGG!";
    }

    @Override
    public String jobSelect(int playerNum) {
        String result;
        switch (playerNum){
            case 0 :{
                result =  "you start warrior.";
                break;}
            case 1 :{
                result ="you start tanker.";
                break;}
            case 2 : {
                result ="you start adventurer.";
                break;}
            default:{
                result ="Please enter again.";}
        }
        return result;
    }

    @Override
    public String showState() {
        String showState = "";
        //List studying
//        System.out.println(playerList.toString());
//        System.out.println("0 : "+playerList.get(0));
//        System.out.println(playerList.get(1));
//        System.out.println(playerList.get(1)+" : attack "+playerList.get(3)+
//                    ", HP "+ playerList.get(4)+", skill "+playerList.get(5));

        //Map studying
//        System.out.println(playerMap.get(jobSelect).getJobName()+" : attack "+playerMap.get(jobSelect).getAttack()+
//                ", HP "+ playerMap.get(jobSelect).getHealthPont()+", skill "+playerMap.get(jobSelect).getSkillName());

        return "showState";
    }

}
