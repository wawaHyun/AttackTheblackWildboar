package serviceImpl;

import model.PlayerDto;
import builder.PlayerBuilder;
import service.ContinueService;

import java.util.HashMap;
import java.util.Map;

public class ContinueServiceImpl implements ContinueService {
    private static ContinueService instance = new ContinueServiceImpl();
    int jobselNum;
    Map<String,PlayerDto> player;
    private ContinueServiceImpl(){
        this.player = new HashMap<>();
    }
    public static ContinueService getInstance(){ return instance;}

    @Override
    public int jobSelect(int jobSelectNum) {
        if(jobSelectNum >=3){
            System.out.println("잘못 입력되었습니다.\n다시 시작하세요.");
            System.exit(0);
        }else {
            switch (jobSelectNum){
                case 0 : {
                    System.out.println("전사로 시작합니다.");
                    player.put(jobSelectNum,new PlayerBuilder()
                            ..build());
                    break;
                }
                case 1 :{
                    System.out.println("탱커로 시작합니다.");
                    break;
                }
                case 2 : {
                    System.out.println("모험가로 시작합니다.");
                    break;}
                default:{
                    System.out.println("다시 입력하세요");}
            }
        }
            return this.jobselNum = jobSelectNum;
    }

    @Override
    public String getThePig(String getThePig) {
        return null;
    }

    @Override
    public String showState() {
        PlayerDto jobNum = new PlayerBuilder()
                .jobSelectNum(this.jobselNum)
                .build();

        String showState = "";

        switch (jobNum.getJobSelectNum()){
            case 0 : { showState = "전사 : 공격력 "+jobNum.getAttack()+
                    ", 체력 "+ jobNum.getHealthPont()+", 스킬 "+jobNum.getSkillValue();
                break;}
            case 1 : { showState = "탱커 : 공격력 "+jobNum.getTankerAttack()+
                    ", 체력 "+jobNum.getTankerHp()+", 스킬 "+jobNum.getTankerSkillValue(); break;}
            case 2 : { showState = "모험가 : 공격력 "+jobNum.getDefaultPlayerAttack()+
                    ", 체력 "+jobNum.getDefaultPlayerHp()+", 스킬 "+jobNum.getDefaultPlayerSkillValue(); break;}
            default:
                System.out.println("잘못된 입력입니다.");
        }
        return showState;
    }
}
