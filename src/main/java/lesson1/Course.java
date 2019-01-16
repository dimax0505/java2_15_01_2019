package lesson1;

class Course {
    private Obstacle[] obstacles;

    Course(Obstacle ... obstacles){
        this.obstacles = new Obstacle[obstacles.length];
        init(obstacles);
    }

    private void init(Obstacle[] obstacles) {
        System.arraycopy(obstacles, 0, this.obstacles, 0, obstacles.length);
    }

    void doIt(Team team){
        for (Competitor competitor: team.getCompetitors()){
            for (Obstacle obstacle: obstacles){
                obstacle.doIt(competitor);
                if (!competitor.onDistance()) break;
            }
        }
    }
}
