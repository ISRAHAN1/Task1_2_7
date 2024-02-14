package Glava_2.Task_2_1_8;

public class Robots {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP, 3, 0);
        Robot.moveRobot(robot,0, 0);
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

        public void turnLeft() {
            switch (direction) {
                case RIGHT -> direction = Direction.DOWN;
                case DOWN -> direction = Direction.LEFT;
                case LEFT -> direction = Direction.UP;
                case UP -> direction = Direction.RIGHT;
                default -> {
                }
            }
        }

        public void turnRight() {
            switch (direction) {
                case RIGHT -> direction = Direction.UP;
                case DOWN -> direction = Direction.RIGHT;
                case LEFT -> direction = Direction.DOWN;
                case UP -> direction = Direction.LEFT;
                default -> {

                }
            }
        }

        public void stepForward() {
            switch (direction) {
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

        public static void moveRobot(Robot robot, int x, int y) {
            System.out.println("Начальная позиция " + robot.getX() + " " + robot.getY());
            if (robot.getX() == x && robot.getY() == y) {
                System.out.println(("Робот уже находится на заданных координатах"));
            } else {
                System.out.println("Робот не находится на заданных координатах");
            }
            if (robot.getX() != x) {
                if (x < robot.getX()) {
                    robot.direction=Direction.LEFT;
                } else {
                    robot.direction=Direction.RIGHT;

                }
                while (robot.getX() != x) {
                    robot.stepForward();
                }
                if (robot.getY()!=y){
                    if(y>robot.getY()){
                        robot.direction=Direction.UP;
                    }else{
                        robot.direction=Direction.DOWN;
                    }
                    while(robot.getY()!=y){
                        robot.stepForward();
                    }
                }
            }

        }
    }
}

