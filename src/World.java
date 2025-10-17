public class World {
    private boolean isRaining;
    private int day;// 1 er Mandag, 2 er Tirsdag, ..., 7 for Søndag, 8 er Mandag...

    public World(int day, boolean isRaining) {
        this.day = day;
        this.isRaining = isRaining;
    }

    public boolean isSunday() {
        if (day % 7 == 0) {
            return true;
        }
        return false;
    }

    public boolean getIsRaining() {
        return this.isRaining;}

    public int getDay() {
        return this.day;
    }
}