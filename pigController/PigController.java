package pigController;

import service.AttackService;
import service.ContinueService;
import serviceImpl.ContinueServiceImpl;

public class PigController {
    ContinueService contiSer;
    AttackService attack;
    public PigController(){
        this.contiSer = ContinueServiceImpl.getInstance();
    }
    public String showState() {
        return contiSer.showState();
    }
    public String AttackPig() {
        int pig = 50;
        return "";
    }
}


