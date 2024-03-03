package builder;

import model.PigDto;

public class PigBuilder {
    private String pigName;
    private String pigPicture;
    private int pigHP;
    private int pigAttack;

    public PigBuilder pigName(String pigName){
        this.pigName = pigName;
        return this;
    }
    public PigBuilder pigPicture(String pigPicture){
        this.pigPicture = pigPicture;
        return this;
    }
    public PigBuilder pigHP(int pigHP){
        this.pigHP = pigHP;
        return this;
    }
    public PigBuilder pigAttack(int pigAttack){
        this.pigAttack = pigAttack;
        return this;
    }
    public PigDto build(){
        return new PigDto(pigName,pigPicture,pigHP,pigAttack);
    }

}
