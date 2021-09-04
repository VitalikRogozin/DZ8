package com.Geekbrains;

public class Main {

    public static void main(String[] args) {
        Participants[] participants = {
                new Human("Вася", 12, 2),
                new Cat("Барс", 10, 1),
                new Robot("R2", 2),
                new Human("Витлик", 6, 1),
                new Cat("Додик", 3, 1),
                new Robot("TeleGramm", 3)};

        Obstructive[] obstructives = new Obstructive[4];
        obstructives[0] = new RunningTrack(2);
        obstructives[1] = new Wall(0);
        obstructives[2] = new RunningTrack(10);
        obstructives[3] = new Wall(2);

        for (Participants p: participants) {
            System.out.println(p.toString());
            for (Obstructive o: obstructives) {
                if (!o.overcome(p)) {
                    break;
                }
            }
        }
    }

}
