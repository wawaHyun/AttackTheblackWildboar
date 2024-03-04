package model;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"pigName"})

public class Pig {
    private String pigName;
    private String pigPicture;
    private int pigHP;
    private int pigAttack;
    @Builder(builderClassName = "budiler")
    public Pig (String pigName, String pigPicture, int pigHP, int pigAttack){
        this.pigName=pigName;
        this.pigPicture=pigPicture;
        this.pigHP=pigHP;
        this.pigAttack=pigAttack;
    }
}
