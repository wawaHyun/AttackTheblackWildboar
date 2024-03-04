package model;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"jobSelectNum"})

public class Player {
    private int jobSelectNum;
    private String jobName;
    private int attack;
    private int healthPont;
    private String skillName;
    private int skillValue;
    private int guiltyConscienceValue;
    @Builder(builderClassName = "builder")
    public Player(int jobSelectNum, String jobName, int attack, int healthPont, String skillName, int skillValue,
                  int guiltyConscienceValue){
        this.jobSelectNum = jobSelectNum;
        this.jobName = jobName;
        this.attack = attack;
        this.healthPont = healthPont;
        this.skillName = skillName;
        this.skillValue = skillValue;
        this.guiltyConscienceValue = guiltyConscienceValue;
        }
    }
