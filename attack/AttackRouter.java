package attack;

import ready.ReadyRouter;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

public enum AttackRouter {
    Pig("pig", i -> {
        System.out.println("wrong input.");
        return true;
    }),
    Wpig("wPig", i -> {
        System.out.println("wrong input.");
        return true;
    }),
    WBpig("wbPig", i -> {
        System.out.println("wrong input.");
        return true;
    }),
    Wrong("wrong", i -> {
        System.out.println("wrong input.");
        return true;
    }),
    Exit("0", i -> {
        ReadyRouter.getReayRouter(i);
        return false;
    });;

    private final String name;
    private final Predicate<Scanner> predi;

    AttackRouter(String name, Predicate<Scanner> predi) {
        this.name = name;
        this.predi = predi;
    }

    public static boolean getAttackRouter(Scanner sc) {
        System.out.println("0-back to ready, 1-get the pig");

        String selcet = sc.next();

        return Stream.of(AttackRouter.values())
                .filter(i -> i.name.equals(selcet))
                .findAny().orElse(Wrong).predi.test(sc);
    }
}
