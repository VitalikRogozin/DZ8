package com.Geekbrains;

public class Cat extends SuperClass implements AbleToJump, AbleToRun, Participants{
    private final String name;
    private final int runLimit;
    private final int jumpLimit;

    public Cat(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }


    @Override
    public String toString() {
        return String.format("Кот %s: могу бежать %d км/ч, перепрыгнуть %dм", name, runLimit, jumpLimit);
    }

    @Override
    public int getJumpLimit() {
        return jumpLimit;
    }

    @Override
    public void jump(String barier) {
        System.out.printf("%s: Перепрыгнул \n", barier);
        sleep();
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
