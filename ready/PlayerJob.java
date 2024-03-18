package ready;

import model.Player;

public enum PlayerJob {
    Warrior("warrior", 1,"warrior",
            70,30,"Strong Attack",
            0, 0),

    Tanker("tanker",2,"tanker",
            30,70,"Recover HP",
            0,0),
    Adventurer("adventurer",3,"adventurer",
            50,50,"Attack Avoid",
            0,0)
    ;

    private final String name;
    private final int jobNum;
    private final String jobName;
    private final int palyerAttack;
    private final int healthPont;
    private final String skillName;
    private final int skillValue;
    private final int guiltyConscienceValue;

    PlayerJob(String name,int jobNum, String jobName, int palyerAttack, int healthPont, String skillName, int skillValue, int guiltyConscienceValue) {
        this.name = name;
        this.jobNum = jobNum;
        this.jobName = jobName;
        this.palyerAttack = palyerAttack;
        this.healthPont = healthPont;
        this.skillName = skillName;
        this.skillValue = skillValue;
        this.guiltyConscienceValue = guiltyConscienceValue;
    }
}
