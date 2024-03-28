package com.attackPig.api.Enum;

public enum Messenger {
    JOINS("joinS","Thank you for signing up"),
    WELCOME("welcome","welcome to service!"),
    NOTFOUNDID("notfoundId","There is no ID. please join us."),
    NOTMACTHPW("notmacthPw","password don't match. please try again."),
    ;
    private String name;
    private String scp;

    Messenger(String name,String scp){
        this.name = name;
        this.scp = scp;
    }
}
