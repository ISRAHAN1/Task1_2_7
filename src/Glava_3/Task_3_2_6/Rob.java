package Glava_3.Task_3_2_6;

public class Rob {
    public static void main(String[]args){

    }
    public static class Robot implements RobotConnectionManager, RobotConnection {
        int x;
        int y;



        public Robot(int x, int y) {
            this.x = x;
            this.y = y;

        }
        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    public void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        robotConnectionManager.getConnection();
    }
    @Override
    public void moveRobotTo(int x, int y) {
        System.out.println("Начальное положение x: " + this.getX() + "  y :" + this.getY());
        this.x = x;
        this.y = y;
        System.out.println("Контроль местонахождения y: " + this.getX() + "  y :" + this.getY());
    }

    @Override
    public void close() {
    }

    @Override
    public RobotConnection getConnection() {
        return null;
    }
}
}
