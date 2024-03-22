package ready;

import model.Player;

public enum PlayerJob {
    Warrior("warrior","warrior",
            "70","30","Strong Attack",
            "0", "0"),

    Tanker("tanker","tanker",
            "30","70","Recover HP",
            "0","0"),
    Adventurer("adventurer","adventurer",
            "50","50","Attack Avoid",
            "0","0")
    ;

    private final String name;
    private final String jobName;
    private final String palyerAttack;
    private final String healthPont;
    private final String skillName;
    private final String skillValue;
    private final String guiltyConscienceValue;

    PlayerJob(String name,String jobName, String palyerAttack, String healthPont,
              String skillName, String skillValue, String guiltyConscienceValue) {
        this.name = name;
        this.jobName = jobName;
        this.palyerAttack = palyerAttack;
        this.healthPont = healthPont;
        this.skillName = skillName;
        this.skillValue = skillValue;
        this.guiltyConscienceValue = guiltyConscienceValue;
    }
}
