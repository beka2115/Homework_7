public class Medic extends Hero {
    private int healPoints;


    public void increaseExperience(int healPoints) {
        healPoints = healPoints + (healPoints * 10 / 100);
        System.out.println(healPoints);
        //return healPoints;

    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic вылечил одного из героев");
    }
}
