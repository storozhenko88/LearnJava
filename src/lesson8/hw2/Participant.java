package lesson8.hw2;

public class Participant implements Jumpable, Runnable{
    private boolean condition = true;
    private int canRun;
    private int canJump;

    public Participant( int canRun, int canJump){
        this.canJump = canJump;
        this.canRun = canRun;
    }

    public int getCanRun() {
        return canRun;
    }

    public int getCanJump() {
        return canJump;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    @Override
    public String jump() {
        return "Can jump";
    }

    @Override
    public String run() {
        return "Can run";
    }
}
