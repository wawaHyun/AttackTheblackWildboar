package builder;

import model.PlayerDto;

public class PlayerBuilder {
    private int attack;
    private int healthPont;
    private int skillName;
    private int skillValue;
    private int guiltyConscienceValue;
    private int jobSelectNum;

    public PlayerBuilder attack(int attack){
        this.attack = attack;
        return this;
    }

    public PlayerBuilder healthPont(int healthPont){
        this.healthPont = healthPont;
        return this;
    }
    public PlayerBuilder skillName(int skillName){
        this.skillName = skillName;
        return this;
    }

    public PlayerBuilder skillValue(int skillValue){
        this.skillValue = skillValue;
        return this;
    }
    public PlayerBuilder guiltyConscienceValue(int guiltyConscienceVlaue){
        this.guiltyConscienceValue = guiltyConscienceVlaue;
        return this;
    }
    public PlayerBuilder jobSelectNum(int jobSelectNum){
        this.jobSelectNum = jobSelectNum;
        return this;
    }
  public PlayerDto build(){
        return new PlayerDto(attack,healthPont,skillName,skillValue,
                guiltyConscienceValue,jobSelectNum);
  }

}
