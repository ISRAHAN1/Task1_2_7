package Glava_2.Task_2_1_8;
public class Robots {
    public static void main(String[] args){
        Robot robot = new Robot(Direction.RIGHT,0 ,0);
        robot.turnRight();
        robot.stepForward();
        robot.stepForward();
        robot.stepForward();

    }

    public static class Robot {
        private Direction direction;
        private int x;
        private int y;

        Robot(Direction direction, int x, int y) {
            this.direction = direction;
            this.x = x;
            this.y = y;
        }

        public Direction getDirection() {
            return direction;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnRight() {
            switch (direction) {
                case RIGHT:
                    direction = Direction.UP;
                case DOWN:
                    direction = Direction.RIGHT;
                case LEFT:
                    direction = Direction.DOWN;
                case UP:
                    direction = Direction.LEFT;


            }
        }

        public void turnLeft() {
            switch (direction) {
                case RIGHT:
                    direction = Direction.DOWN;
                case DOWN:
                    direction = Direction.LEFT;
                case LEFT:
                    direction = Direction.UP;
                case UP:
                    direction = Direction.RIGHT;


            }
        }
        public void stepForward() {
            switch(direction){
                case RIGHT:
                    x++;
                case DOWN:
                    y--;
                case LEFT:
                    x--;
                case UP:
                    y++;


            }
        }
    }
}

