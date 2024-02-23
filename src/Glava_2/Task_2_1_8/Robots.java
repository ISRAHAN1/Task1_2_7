package Glava_2.Task_2_1_8;

import static Glava_2.Task_2_1_8.Robot.moveRobot;

public class Robots {
    public static void main(String[]args){
        Robot robot=new Robot(Direction.UP,3,0);
        moveRobot(robot,3,0);
        robot.turnRight();
        robot.stepForward();
        robot.stepForward();
        robot.stepForward();
    }
}

