package serviceImpl;

import model.Player;
import service.ContinueService;

import java.util.*;

public class ContinueServiceImpl implements ContinueService {
    private static ContinueService instance = new ContinueServiceImpl();
    List<Player> playerList;
    Map<String, Player> playerMap;
    String jobSelect;
    private ContinueServiceImpl(){
        this.playerList = new ArrayList<>();
        this.playerMap = new HashMap<>();
    }
    public static ContinueService getInstance(){ return instance;}


    @Override
    public Map<String, Player> jobMap() {
        playerMap.put("0",Player.builder()
                .jobSelectNum(0)
                .jobName("warrior")
                .attack(70)
                .healthPont(30)
                .skillName("Strong Attack")
                .skillValue(0)
                .guiltyConscienceValue(0)
                .build());
        playerMap.put("1",Player.builder()
                .jobSelectNum(1)
                .jobName("tanker")
                .attack(30)
                .healthPont(70)
                .skillName("Recover HP")
                .skillValue(0)
                .guiltyConscienceValue(0)
                .build());
        playerMap.put("2",Player.builder()
                .jobSelectNum(2)
                .jobName("adventurer")
                .attack(50)
                .healthPont(50)
                .skillName("Attack Avoid")
                .skillValue(0)
                .guiltyConscienceValue(0)
                .build());
        return playerMap;
    }

    @Override
    public String jobSelectMap(int playerNum) {
        switch (playerNum){
            case 1 :{
                System.out.println("you start tanker.");
                break;}
            case 2 : {
                System.out.println("you start adventurer.");
                break;}
            default:{
                System.out.println("Please enter again.");}
        }
        jobSelect = String.valueOf(playerNum);
        return null;
    }

    @Override
    public String jobSelectLiSt(Player playerNum) {
        System.out.println("0 : "+playerList.get(0));

        System.out.println(playerList.toString());
        if(playerNum.getJobSelectNum() >=3){
            System.out.println("Getting the numbers wrong.\nPlease reStart Game.");
            System.exit(0);
        }else {
            switch (playerNum.getJobSelectNum()){
                case 0 : {
                    System.out.println("you start warrior.");
                    playerList.add(Player.builder()
                            .jobSelectNum(0)
                            .jobName("warrior")
                            .attack(70)
                            .healthPont(30)
                            .skillName("Strong Attack")
                            .skillValue(0)
                            .guiltyConscienceValue(0)
                            .build());
                    break;}
                case 1 :{
                    System.out.println("you start tanker.");
                    break;}
                case 2 : {
                    System.out.println("you start adventurer.");
                    break;}
                default:{
                    System.out.println("Please enter again.");}
            }
    }
        System.out.println(playerList.toString());
        return "";
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
        System.out.println(playerMap.get(jobSelect).getJobName()+" : attack "+playerMap.get(jobSelect).getAttack()+
                    ", HP "+ playerMap.get(jobSelect).getHealthPont()+", skill "+playerMap.get(jobSelect).getSkillName());

        return showState;
    }
}
