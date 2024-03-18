package ready;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

public enum ReadyRouter {
    Start("start",i->{
        return true;
    }),
    JobSelect("job",i->{ //job select
        return true;
    }),
    Ready("ready",i->{
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
        ReadyController ready = ReadyController.getInstance();
        ready.start();
        ready.jobSelect(sc);

        String select = sc.next();
        return Stream.of(ReadyRouter.values())
                .filter(i->i.name.equals(select))
                .findAny().orElse(Wrong)
                .predi.test(sc);

    }
}
