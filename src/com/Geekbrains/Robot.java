package com.Geekbrains;

public class Robot extends SuperClass implements AbleToRun, Participants{
    private final String name;
    private final int runLimit;

    public Robot(String name, int runLimit) {
        this.name = name;
        this.runLimit = runLimit;

    }


    @Override
    public String toString() {
        return String.format("Робот %s: могу Бежать %d км/ч", name, runLimit);
    }

    @Override
    public int getRunLimit() {
        return runLimit;
    }

    @Override
    public void run(String barier) {
        System.out.printf("%s: Пробежал \n", barier);
        sleep();
    }
}
