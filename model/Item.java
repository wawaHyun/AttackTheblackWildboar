package model;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"sorwd"})

public class Item {
    private int sorwd;
    private int kookie;
    private int littlePig;
    @Builder(builderClassName = "builder")
    public Item (int sorwd, int kookie, int littlePig){
        this.sorwd=sorwd;
        this.kookie=kookie;
        this.littlePig=littlePig;
    }

}
