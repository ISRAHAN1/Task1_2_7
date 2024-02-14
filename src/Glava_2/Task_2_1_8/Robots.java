package Glava_2.Task_2_1_8;

public class Robots {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP, 0, 0);
        Robot.moveRobot(robot,3 , 0);
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
                    break;
                case DOWN:
                    y--;
                    break;
                case LEFT:
                    x--;
                    break;
                case UP:
                    y++;
                    break;
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
                if (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
                while (robot.getX() != x) {
                    robot.stepForward();
                }
                if (robot.getY() != y) {
                    if (robot.getDirection() != Direction.DOWN) {
                        robot.turnLeft();
                    } else {
                        robot.turnRight();

                    }
                    while (robot.getY() != y) {
                        robot.stepForward();
                    }
                }
            }

        }
    }
}

