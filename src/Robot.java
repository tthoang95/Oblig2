public class Robot {
    // gi robotten 4 attributter: name, batteryLevel, distancetoPark og botType
    String name;
    double batteryLevel;
    int distancetoPark;
    String botType;

    public Robot(String name, double batteryLevel, int distancetoPark, String botType) {
        this.name = name;
        this.batteryLevel = batteryLevel;
        this.distancetoPark = distancetoPark;
        this.botType = botType;
    }

    public String reportStatus() {
        // Metode for å rapportere statusen til robotten
        // Endre metoden slik at den retunerer en tekst streng som forklarer statusen til roboten
        // eksempel: Dette er bot Dancatron 4000 av type B-Bot.
        // Denne enheten har 80.0 batterikapasitet igjen og bor 1500 meter fra parken.
        return "Dette er en bot " + name + " av type " + botType + ". Denne enheten har " + batteryLevel + " batterikapasitet igjen og bor " + distancetoPark + " meter fra parken.";

    }

    public boolean canWalkToThePark(World world) {
        System.out.println("canWalkToThePark-metoden sjekker om boten " + name + " kan gå til parken...");
        if (!world.getIsRaining()) {
            if (world.isSunday()) {
                if (100 <= distancetoPark / batteryLevel) {
                    System.out.println(name + "boten kan gå i parken!");
                    return true;
                } else {
                    System.out.println(name + "boten kan ikke gå i parken fordi den ikke har nok batteri.");
                }
            } else {
                System.out.println(name + " boten kan ikke gå i parken fordi det er ikke søndag.");
            }
        } else {
            System.out.println(name + " boten kan ikke gå i parken fordi det regner.");
        }
        return false;
    }


    // Sjekk om det er søndag. Kan bare gå i parken på søndager.

    // Sjekk batterinivå. En bot trenger 1% batterinivå per 100 meter for å gå til parken. //divisjon


    public boolean canDanceAtClub(World world) {
        System.out.println("canDanAtClub-metoden sjekker om " + name + " boten kan være med på dansegulvet...");

        if (botType.equals("B-bot")) {
            if (5000 <= distancetoPark / batteryLevel) {
                if (world.getDay() % 7 == 1) {
                    System.out.println(name + " kan være med på dansegulvet!");
                    return true;
                } else {
                    System.out.println(name + " er ikke B-bot og kan ikke være med.");
                }
            } else {
                System.out.println(name + " har ikke nok batterinivå for å være med på dansegulvet.");
            }
        } else {
            System.out.println("Dansegulvet er stengt på mandager.");

        }
        return false;
    }
}




// lag en metode som heter canDanceAtClub, som sjekker om boten kan være med på danseklubben
// bottypen må være av type B-Bot (hint .equals)
// En bot trenger minimum 50% batterikapasitet for å være med
// Det kan ikke være mandag. Da er danseklubben stengt.]

