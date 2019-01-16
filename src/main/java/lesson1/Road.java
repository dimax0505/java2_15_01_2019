package lesson1;

class Road extends Obstacle {
    private int dist;

    Road(int dist) {
        this.dist = dist;
    }

    @Override
    void doIt(Competitor competitor) {
        competitor.run(dist);
    }
}
