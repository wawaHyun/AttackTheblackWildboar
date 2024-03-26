package model;

public enum test {
    PIG("pig","0","100","10");

    private final String name;
    private final String monLV;
    private final String monHP;
    private final String monAP;

    test(String name, String monLV, String monHP, String monAP) {
        this.name = name;
        this.monLV = monLV;
        this.monHP = monHP;
        this.monAP = monAP;
    }
}
