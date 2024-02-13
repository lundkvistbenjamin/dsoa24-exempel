import java.util.LinkedList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String[] lotrCharacters = {"Frodo", "Samwise", "Gandalf", "Aragorn", "Legolas", "Gimli", "Boromir", "Gollum", "Saruman", "Galadriel", "Elrond", "Glorfindel", "Bilbo", "Merry", "Pippin", "Treebeard", "Faramir", "Éowyn", "Éomer", "Grima"};


        //CC: Circular Arr-gument
        String[] weekDays = { "må", "ti", "on", "to", "fr", "lö", "sö" };

        int today = 4;
        System.out.printf("I dag är det %s\n",weekDays[today]);
        System.out.printf("I övermorgon är det %s\n", weekDays[today+2]);
        System.out.printf("Om %d dagar är det %s, Om %d dagar är det %s\n", 6, weekDays[(today + 6) % weekDays.length], 15, weekDays[(today + 15) % weekDays.length]);

        /*
        Graphy graphy = new Graphy();
        graphy.createNode("skj", "Skjorta");
        graphy.createNode("jea", "Jeans");
        graphy.createNode("sli", "Slips");
        graphy.createNode("cro", "Crocs");
        graphy.printGraph();

        graphy.addEdge("skj", "sli");


        Queuey queuey = new Queuey();
        queuey.enqueue(lotrCharacters[0]);
        queuey.enqueue(lotrCharacters[1]);
        queuey.enqueue(lotrCharacters[2]);
        queuey.enqueue(lotrCharacters[3]);
        queuey.dequeue();
        queuey.dequeue();


        Stacky stacky = new Stacky(5);
        stacky.push(lotrCharacters[0]);
        stacky.push(lotrCharacters[5]);
        stacky.push(lotrCharacters[7]);
        System.out.println("Stacky: " + stacky);
        System.out.println("pop: " + stacky.pop());
        stacky.push("Nytt");
        System.out.println("Stacky: " + stacky);
        System.out.println("pop: " + stacky.pop());

        System.out.println("Stacky: " + stacky);

        StringArray lotr = new StringArray(lotrCharacters);

        Person sauron = new Person("Sauron");
        Person gandalf = new Person("Gandalf");
        Person theoden = new Person("Théoden");

        Linky linky = new Linky();
        linky.add(sauron);
        linky.add(gandalf);
        linky.add(theoden);
        linky.printLinky();

        System.out.printf("linky.size(): %d\n", linky.size());
        */


        /*
        System.out.println("lotr size: " + lotr.size());
        System.out.println(lotr);
        lotr.add("Sauron");
        System.out.println(lotr);
        lotr.add(5, "Théoden");
        System.out.println(lotr);
        lotr.reverse();
        System.out.println(lotr);

        new BigO();
        */

    }
}