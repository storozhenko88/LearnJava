package lesson8.hw2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(100, 5);
        Robot robot = new Robot(10, 1);
        Human human = new Human(1000, 3);
        Participant[] participants = {cat, robot, human};

        Treadmill treadmill = new Treadmill(99);
        Wall wall = new Wall(4);
        Obstacle[] obstacles = new Obstacle[]{treadmill, wall};

        for (Obstacle ob: obstacles) {
            for (Participant participant: participants) {
                if (participant.isCondition()) {
                    ob.overcome(participant);
                }
            }
        }


        }

    }

