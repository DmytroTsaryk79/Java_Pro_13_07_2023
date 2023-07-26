package lessons.lesson5;

public class Cat implements Participant {
String name;
int maxRunDistance;
int maxJumpHeight;

public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        }

@Override
public void run() {
        System.out.println(name + " біжить");
        }

@Override
public void jump() {
        System.out.println(name + " стрибає");
        }
}
