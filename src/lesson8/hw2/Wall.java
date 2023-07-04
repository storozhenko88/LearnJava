package lesson8.hw2;

public class Wall extends Obstacle{
    private int height;

    public Wall(int height){
        this.height = height;
    }

    @Override
    public void overcome(Participant participant) {
        if (participant.getCanJump() > height)
            System.out.println(participant.getClass() + " " + participant.jump());
        else
            participant.setCondition(false);

    }
}
