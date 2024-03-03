package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class PigDto {
    private String pigName;
    private String pigPicture;
    private int pigHP;
    private int pigAttack;
}
