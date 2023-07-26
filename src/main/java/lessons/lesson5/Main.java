package lessons.lesson5;

public class Main {
    public static void main(String[] args) {
       Participant[] participants = {
                new Human("Олег", 1000, 2),
                new Cat("Мурка", 500, 3),
                new Robot("R2-D2", 2000, 1)};


       Obstacle[] obstacles = {
                new Track(800),
                new Wall(1),
                new Track(1500),
                new Wall(2)};

       for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcome(participant)) {
                    break;}
            }
        }
    }
}