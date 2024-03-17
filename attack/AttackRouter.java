package attack;

import java.util.Scanner;
import java.util.function.Predicate;

public enum AttackRouter {
    Pig("Pig",i->{
        System.out.println("wrong input.");
        return true;
    }),
    Wrong("wrong",i->{
        System.out.println("wrong input.");
        return true;
    }),
    Exit("exit",i->{
        System.out.println("back to ready.");
        return false;
    })
    ;
    ;

    private final String name;
    private final Predicate<Scanner> predi;

    AttackRouter(String name, Predicate<Scanner> predi) {
        this.name = name;
        this.predi = predi;
    }
}
