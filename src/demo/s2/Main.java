package demo.s2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Generic g = new Generic();
        g.demoGeneric(1.5);

        Generic<String,Integer> g2 = new Generic<>();
        g2.key = "hello";
        g2.value = 19;
        Generic<Integer,Integer> g3 = new Generic<>();
        g3.key = 1;

        Actor<Integer> aVN = new Actor<>();
        Actor<String> aJ = new Actor<>();
        ActorUS u = new ActorUS();
        u.id = "abc123";

        ArrayList<? super Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1.5);

    }
}
