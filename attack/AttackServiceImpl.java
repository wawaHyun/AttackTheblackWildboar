package attack;

public class AttackServiceImpl implements AttackService{
    private static AttackService instance = new AttackServiceImpl();

    public AttackServiceImpl() {
    }

    public static AttackService getInstance() {
        return instance;
    }

    @Override
    public String AttackPig() {
        return "AttackPig";
    }

    @Override
    public String dropItem() {
        return "dropItem";
    }

    @Override
    public String resetStats() {
        return "resetStats";
    }
}
