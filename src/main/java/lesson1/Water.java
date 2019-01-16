package lesson1;

class Water extends Obstacle {

    private int dist;

    Water(int dist) {
        this.dist = dist;
    }

    @Override
    void doIt(Competitor competitor) {
        competitor.swim(dist);
    }
}
