package serviceImpl;

import model.Pig;
import service.AttackService;

public class AttackServiceImpl implements AttackService {
    private static AttackService instance = new AttackServiceImpl();

    private AttackServiceImpl(){

    }
    public static AttackService getInstance(){ return instance;}

    @Override
    public String AttackPig(Pig pig) {

        return "";
    }

    @Override
    public String dropItem() {
        return null;
    }

    @Override
    public String resetStats() {
        return null;
    }
}
