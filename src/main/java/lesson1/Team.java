package lesson1;

class Team {
    private Competitor[] competitors;

    Team(Competitor ... competitors) {
        this.competitors = competitors;
       // init(competitors);
    }

//    private void init(Competitor[] competitors){
//        System.arraycopy(competitors, 0, this.competitors, 0, competitors.length);
//    }

    void showResult() {
        System.out.println("Участники команды:");
        showAll();
        System.out.println("участники прошедшие дистанцию:");
        showSuccessCompetitors();
    }

    private void showAll() {
        for (Competitor competitor : competitors) {
            competitor.info();
        }
    }

    private void showSuccessCompetitors() {
        for (Competitor competitor : competitors) {
            if (competitor.onDistance()) competitor.info();
        }
    }

    Competitor[] getCompetitors() {
        return competitors;
    }
}
