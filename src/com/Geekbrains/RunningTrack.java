package com.Geekbrains;

public class RunningTrack implements Obstructive{
    private final int speed;

    RunningTrack(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean overcome(Participants participle) {
        String name = String.format("   Скоростной режим беговой дорожки: %d км/ч", speed);
        if (!(participle instanceof AbleToRun)) {
            System.out.printf("%s: не умеет бегать, не побежит \n", name);
            return true;
        }
        int runLimit = ((AbleToRun) participle).getRunLimit();
        if (speed > runLimit) {
            System.out.printf("%s: не смог развить скорость. Скорость больше возможной на %d км/ч \n", name,  speed - runLimit);
            System.out.println("      выбыл из соревнований");
            return false;
        }
        ((AbleToRun) participle).run(name);
        return true;
    }

}
