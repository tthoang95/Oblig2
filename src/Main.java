public class Main {
    public static void main(String[] args) {
        // Oppretter en Verden-objekt (omgivelsene)
        World todaysWorld = new World(7, false);

        // Opprett to Robot-objekter
        Robot robotV1 = new Robot("Dancatron 4000",0.9,100,"B-bot");
        System.out.println(robotV1.reportStatus());

        robotV1.canWalkToThePark(todaysWorld);
        robotV1.canDanceAtClub(todaysWorld);

        Robot robotV2 = new Robot("Spark-E",40.30,1000,"Toaster");
        System.out.println(robotV2.reportStatus());
        // med navn, f.eks. Dancatron 4000 og Spark-E
        // med botType "B-Bot" og "Toaster"
        // med forskjellig batterinivå
        // med forskjellig avstand til parken
        // print ut statusen til begge robottene

        robotV2.canWalkToThePark(todaysWorld);
        robotV2.canDanceAtClub(todaysWorld);

        // Sjekk om robotene kan gå til danseklubben
        // Sjekk om robotene kan gå til parken
    }
}