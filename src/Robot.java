public class Robot {
    private String name;
    private double batteryLevel;
    private int distancetoPark;
    private String botType;

    public Robot(String name, double batteryLevel, int distancetoPark, String botType) {
        this.name = name;
        this.batteryLevel = batteryLevel;
        this.distancetoPark = distancetoPark;
        this.botType = botType;
    }

    public String reportStatus() {
        return "Dette er en bot " + name + " av type " + botType + ". Denne enheten har " + batteryLevel + " batterikapasitet igjen og bor " + distancetoPark + " meter fra parken.\n";

    }

    public boolean canWalkToThePark(World world) {

        double distanceRobotCanWalk = batteryLevel * 100;

        System.out.println("canWalkToThePark-metoden sjekker om " + name + " kan gå til parken.");
        if (world.getIsRaining()) {
            System.out.println(name + " kan ikke gå i parken fordi det regner.\n");
            return false;
        }
        if (!world.isSunday()) {
            System.out.println(name + " kan ikke gå i parken fordi det ikke er søndag.\n");
            return false;
        }
        if (distanceRobotCanWalk < distancetoPark) {
            System.out.println(name + " kan ikke gå i parken fordi den ikke har nok batteri.\n");
            return false;
        }
        System.out.println(name + " kan gå i parken!\n");
        return true;
    }

    public boolean canDanceAtClub(World world) {
        System.out.println("canDanAtClub-metoden sjekker om " + name + " boten kan være med på dansegulvet...");

        if (!(botType.equals("B-bot") && (batteryLevel >= 50))) {
            System.out.println(name + " oppfyller ikke kravet om å få være med på dansegulvet.\n");
            return false;
        }
        if (world.getDay() % 7 == 1) {
            System.out.println("Klubben er stengt på mandager.\n");
            return false;
        }
        System.out.println(name + " kan være med på dansegulvet!\n");
        return true;
    }
}