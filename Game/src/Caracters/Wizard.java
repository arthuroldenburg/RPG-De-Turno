package Caracters;

public class Wizard extends Caracters{
    protected int inteligence;

    public Wizard(){}

    public Wizard(String name, int life, int attack, int defense, int inteligence) {
        super(name, life, attack, defense);
        this.inteligence = inteligence;
    }

    public int getInteligence() {
        return inteligence;
    }

    public void setInteligence(int inteligence) {
        this.inteligence = inteligence;
    }
}
