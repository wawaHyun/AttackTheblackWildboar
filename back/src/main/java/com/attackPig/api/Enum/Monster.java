package com.attackPig.api.Enum;

import lombok.Getter;

@Getter
public enum Monster {
    PIG("forest","pig","0","100","10"),
    WPIG("forest","wildPig","1","200","15"),
    BWPIG("forest","blackWildPig","2","300","20"),
    RABBIT("grass","rabbit","3","350","25"),
    WRABBIT("grass","whiteRabbit","4","400","30"),
    WWRABBIT("grass","whiteWildRabbit","5","450","35")
    ;

private final String ground; //사냥터
private final String monName; 
private final String monLV;
private final String monHP;
private final String monAP;

Monster(String ground,String monName, String monLV, String monHP, String monAP) {
    this.ground = ground;
    this.monName = monName;
    this.monLV = monLV;
    this.monHP = monHP;
    this.monAP = monAP;
}
}
