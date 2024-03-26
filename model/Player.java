package model;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"jobid"})

public class Player {
    private Long jobid;
    private String jobName;
    private String attack;
    private String healthPont;
    private String skillName;
    private String skillValue;
    private String guiltyConscienceValue;
    @Builder(builderClassName = "builder")
    public Player(Long jobid, String jobName, String attack, String healthPont, String skillName, String skillValue,
                  String guiltyConscienceValue){
        this.jobid = jobid;
        this.jobName = jobName;
        this.attack = attack;
        this.healthPont = healthPont;
        this.skillName = skillName;
        this.skillValue = skillValue;
        this.guiltyConscienceValue = guiltyConscienceValue;
        }
    }
