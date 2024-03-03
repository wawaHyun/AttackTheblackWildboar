package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class PlayerDto {

    private int attack;
    private int healthPont;
    private int skillName;
    private int skillValue;
    private int guiltyConscienceValue;
    private int jobSelectNum;
}
