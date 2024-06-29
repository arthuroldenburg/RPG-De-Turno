package Caracters;

public class Warrior extends Caracters{
    protected int strenght;

    public Warrior() {}

    public Warrior(String name, int life, int attack, int defense, int strenght) {
        super(name, life, attack, defense);
        this.strenght = strenght;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }
}
