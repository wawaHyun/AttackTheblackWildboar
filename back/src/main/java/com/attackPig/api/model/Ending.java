package com.attackPig.api.model;

import lombok.Getter;

@Getter
public enum Ending {
    HPEND("hpEnd","player의 체력이 다했다.. 집에 가자. "),
    GUILEND("guiltyEnd ","새끼돼지가 너무 가여워.. 집에 가자. "),
    FINALEND("finalEnd  ","배가 너무 부르다~! 집에 가자. ")
    ;
    
    private final String name;
    private final String scp;

Ending(String name,String scp) {
    this.name = name;
    this.scp = scp;
}
}
