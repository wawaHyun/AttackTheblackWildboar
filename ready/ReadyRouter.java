package ready;

import attack.AttackRouter;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

public enum ReadyRouter {
    State("1",i->{
        ReadyController.getInstance().showState();
        return true;
    }),
    Attack("2",i->{
        AttackRouter.getAttackRouter(i);
        return true;
    }),
    Wrong("wrong",i->{
        System.out.println("wrong input.");
        return true;
    }),
    Exit("exit",i->{
        System.out.println("game exit.");
        return false;
    })
    ;
    private final String name;
    private final Predicate<Scanner> predi;

    ReadyRouter(String name, Predicate<Scanner> predi) {
        this.name = name;
        this.predi = predi;
    }
    public static boolean getReayRouter(Scanner sc){
        ReadyController.getInstance().jobSelect(sc);

        System.out.println("Let's ATTACK PIGGG! yammy yummmmy pig!");

        System.out.println("Are you ready to fight the PIG?");
        System.out.println("1-state, 2-fight the pig!!");
        String select = sc.next();
        return Stream.of(ReadyRouter.values())
                .filter(i->i.name.equals(select))
                .findAny().orElse(Wrong)
                .predi.test(sc);

    }
}
