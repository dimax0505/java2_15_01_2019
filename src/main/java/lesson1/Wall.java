package lesson1;

class Wall extends Obstacle {

    private int height;

    Wall(int height) {
        this.height = height;
    }

    @Override
    void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}
