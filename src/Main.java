public class Main {
    public static void main(String[] args) {

        World todaysWorld = new World(7, false);

        Robot robotV1 = new Robot("Dancatron 4000",50,100,"B-bot");
        System.out.println(robotV1.reportStatus());

        robotV1.canWalkToThePark(todaysWorld);
        robotV1.canDanceAtClub(todaysWorld);

        Robot robotV2 = new Robot("Spark-E",40.30,1000,"Toaster");
        System.out.println(robotV2.reportStatus());

        robotV2.canWalkToThePark(todaysWorld);
        robotV2.canDanceAtClub(todaysWorld);
    }
}