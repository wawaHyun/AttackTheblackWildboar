package serviceImpl;

import service.ContinueService;
import service.UtilService;

public class UtilServiceImpl implements UtilService {
    private static UtilService instance = new UtilServiceImpl();
    private UtilServiceImpl(){}
    public static UtilService getInstance(){ return instance;}


    @Override
    public int randomInteger(int start, int maxEnd) {
        return start+(int)(Math.random()*(maxEnd-start));
    }

    @Override
    public int resetState() {
        return resetState();
    }

    @Override
    public int dropItem() {
        return dropItem();
    }
}
