package Caracters;

public class Caracters {
    protected String name;
    protected int life;
    protected int attack;
    protected int defense;

    public Caracters() {
    }

    public Caracters(String name, int life, int attack, int defense) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return this.life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return this.defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
