package builder;

import model.ItemDto;

public class ItemBuilder {
    private int sorwd;
    private int kookie;
    private int littlePig;

    public ItemBuilder sorwd(int sorwd){
        this.sorwd = sorwd;
        return this;
    }
    public ItemBuilder kookie(int kookie){
        this.kookie = kookie;
        return this;
    }
    public ItemBuilder littlePig(int littlePig){
        this.littlePig = littlePig;
        return this;
    }
    public ItemDto build(){
        return new ItemDto(sorwd,kookie,littlePig);
    }

}
