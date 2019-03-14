package ch.juventus.collections;

import java.util.LinkedList;

public class LinkedListExercise {

    public static void main(String[] args) {
        LinkedList<String> troll = new LinkedList<>();
        troll.add("Geier");
        troll.add("Orinoko");
        troll.add("Fledermaus");
        troll.add("Maus");
        troll.add("Katze");
        troll.add("Skorpion");
        troll.add("Seekopfadler");
        troll.add("Sperber");
        troll.add("Elefant");
        troll.add("Alligator");
        System.out.println(troll.size());
        System.out.println(troll.contains("Elefant"));
        System.out.println(troll.getLast());
        System.out.println(troll.remove("Geier"));
        System.out.println(troll.size());
        troll.forEach(System.out::println);
        troll.forEach(e -> System.out.println(e));
    }
}
