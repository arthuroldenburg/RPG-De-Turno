package Caracters;

public class Warrior extends Characters {
    protected int chanceToBlock;

    public Warrior() {}

    public Warrior(String name, int life, int attack, int defense, int chanceToBlock) {
        super(name, life, attack, defense);
        this.chanceToBlock = chanceToBlock;
    }

    public int getChanceToBlock() {
        return chanceToBlock;
    }

    public void setChanceToBlock(int chanceToBlock) {
        this.chanceToBlock = chanceToBlock;
    }
}
