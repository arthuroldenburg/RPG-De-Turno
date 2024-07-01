package Caracters;

public class Archer extends Characters {
    protected int criticalChance;

    public Archer(){}

    public Archer(String name, int life, int attack, int defense, int criticalChance) {
        super(name, life, attack, defense);
        this.criticalChance = criticalChance;
    }

    public int getCriticalChance() {
        return criticalChance;
    }

    public void setCriticalChance(int criticalChance) {
        this.criticalChance = criticalChance;
    }
}
