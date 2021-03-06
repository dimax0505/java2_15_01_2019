package lesson1;

public class Human implements Competitor {
    private String name;

    private int maxRunDistance;
    private int maxSwimDistance;
    private int maxJumpHeight;

    private boolean onDistance = true;

    Human(String name, int maxRunDistance, int maxSwimDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
    }


    public void run(int dist) {
        if (dist <= maxRunDistance){
            System.out.println(name + " пробегает " + dist + "km");
        }else {
            System.out.println(name + " не пробегает " + dist + "km");
            onDistance = false;
        }
    }


    public void swim(int dist) {
        if (dist <= maxSwimDistance){
            System.out.println(name +" проплывает " + dist + "km");
        }else {
            System.out.println(name + " не проплывает " + dist + "km");
            onDistance = false;
        }
    }


    public void jump(int height) {
        if (height <= maxJumpHeight){
            System.out.println(name +" перепрыгивает " + height + "m");
        }else {
            System.out.println(name + " не перепрыгивает " + height + "m");
            onDistance = false;
        }
    }


    public boolean onDistance() {
        return onDistance;
    }


    public void info() {
        System.out.println(name + (onDistance ? " прошел" : " не прошел" ));
    }
}
