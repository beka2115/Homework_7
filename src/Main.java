public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic();
        medic.setHealPoints(10);

        HavingSuperAbility[] ability = {new Magic(),
                medic, new Warrior()};
        for (int i = 0; i < ability.length; i++) {
            ability[i].applySuperAbility();
            if (ability[i] instanceof Medic) {
                ((Medic) ability[i]).increaseExperience(medic.getHealPoints());
            }
            

        }

    }
}