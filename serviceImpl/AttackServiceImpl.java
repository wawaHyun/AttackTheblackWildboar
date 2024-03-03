package serviceImpl;

import model.PigDto;
import service.AttackService;

public class AttackServiceImpl implements AttackService {
    private static AttackService instance = new AttackServiceImpl();

    private AttackServiceImpl(){

    }
    public static AttackService getInstance(){ return instance;}

    @Override
    public String AttackPig(PigDto pig) {

        return "";
    }
}
