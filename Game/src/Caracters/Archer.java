package Caracters;

public class Archer extends Caracters{
    protected int dexterity;

    public Archer(){}

    public Archer(String name, int life, int attack, int defense, int dexterity) {
        super(name, life, attack, defense);
        this.dexterity = dexterity;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
}
