public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String ability;

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getAbility() {
        return ability;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }


}
