package lesson1;

class Course {
    private Obstacle[] obstacles;

    Course(Obstacle ... obstacles){
        this.obstacles = obstacles;
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
