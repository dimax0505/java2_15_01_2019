package lesson1;

public class Main {
    public static void main(String[] args) {

        Team team = new Team(
                new Dog("Jack", "black", 10, 1, 2),
                new Cat("Mag", "white", 10, 0, 3),
                new Turtle("Turtle", "green", 100, 10, 0),
                new Human("Rick", 8, 10, 2));

        Course course = new Course(
                new Road(8),
                new Wall(2),
                new Water(1),
                new Wall(2)
        );

        course.doIt(team);
        team.showResult();
    }
}



