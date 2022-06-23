public class GameEntity {
    int health;
    int damage;

    public int getHealth() {
        return health;
    }

    public GameEntity(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;

    }

    }

