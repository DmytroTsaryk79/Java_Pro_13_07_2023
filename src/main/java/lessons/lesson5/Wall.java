package lessons.lesson5;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (participant instanceof Human) {
            if (((Human) participant).maxJumpHeight >= height) {
                System.out.println("Учасник " + ((Human) participant).name + " подолав стіну висотою " + height);
                return true;
            }
        } else if (participant instanceof Cat) {
            if (((Cat) participant).maxJumpHeight >= height) {
                System.out.println("Учасник " + ((Cat) participant).name + " подолав стіну висотою " + height);
                return true;
            }
        } else if (participant instanceof Robot) {
            if (((Robot) participant).maxJumpHeight >= height) {
                System.out.println("Учасник " + ((Robot) participant).name + " подолав стіну висотою " + height);
                return true;
            }
        }
        System.out.println("Учасник не подолав стіну висотою " + height);
        return false;
    }
}