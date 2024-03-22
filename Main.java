import ready.ReadyController;
import ready.ReadyRouter;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReadyController.getInstance().start();
        while (ReadyRouter.getReayRouter(sc));

    }
}