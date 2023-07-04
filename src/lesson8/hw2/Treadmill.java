package lesson8.hw2;

public class Treadmill extends Obstacle{
    private int length;

    public Treadmill (int length){
        this.length = length;
    }

    @Override
    public void overcome(Participant participant) {
        if (participant.getCanRun() > length)
            System.out.println(participant.getClass() + " " + participant.run());
        else
            participant.setCondition(false);

    }
}
