package Caracters;

public class Wizard extends Characters {
    protected int chanceToReuseSkill;

    public Wizard(){}

    public Wizard(String name, int life, int attack, int defense, int chanceToReuseSkill) {
        super(name, life, attack, defense);
        this.chanceToReuseSkill = chanceToReuseSkill;
    }

    public int getIntelligence() {
        return chanceToReuseSkill;
    }

    public void setIntelligence(int chanceToReuseSkill) {
        this.chanceToReuseSkill = chanceToReuseSkill;
    }
}
