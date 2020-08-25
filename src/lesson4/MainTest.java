package lesson4;

import lesson4.task1.Kvadrat;
import lesson4.task1.Rectangle;
import lesson4.task2.Runner;
import lesson4.task2.Singer;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        //1
        Kvadrat k = new Kvadrat(2, 2);
        Rectangle r = new Rectangle(2, 4);
        System.out.println(k.square());
        System.out.println(r.square());

        //2
        List singers = new ArrayList<Singer>();
        List runners = new ArrayList<Runner>();

        Singer singer1 = new Singer("Natalia", 15);
        Singer singer2 = new Singer("Maria", 9);
        Singer singer3 = new Singer("Vladislav", 1);
        Runner runner1 = new Runner("Sviat", 21);
        Runner runner2 = new Runner("Juliana", 21);

        singers.add(singer1);
        singers.add(singer2);
        singers.add(singer3);

        runners.add(runner1);
        runners.add(runner2);
        System.out.println(singers);
        System.out.println(runners);


    }
}
