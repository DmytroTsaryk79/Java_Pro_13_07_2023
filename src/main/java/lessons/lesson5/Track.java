package lessons.lesson5;

public class Track implements Obstacle {
    private int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (participant instanceof Human) {
            if (((Human) participant).maxRunDistance >= distance) {
                System.out.println("Учасник " + ((Human) participant).name + " пройшов бігову доріжку на дистанції " + distance);
                return true;
            }
        } else if (participant instanceof Cat) {
            if (((Cat) participant).maxRunDistance >= distance) {
                System.out.println("Учасник " + ((Cat) participant).name + " пройшов бігову доріжку на дистанції " + distance);
                return true;
            }
        } else if (participant instanceof Robot) {
            if (((Robot) participant).maxRunDistance >= distance) {
                System.out.println("Учасник " + ((Robot) participant).name + " пройшов бігову доріжку на дистанції " + distance);
                return true;
            }
        }
        System.out.println("Учасник не пройшов бігову доріжку на дистанції " + distance);
        return false;
    }
}