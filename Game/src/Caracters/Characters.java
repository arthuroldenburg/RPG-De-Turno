package Caracters;

import java.util.ArrayList;
import java.util.Scanner;

public class Characters {
    protected String name;
    protected int life;
    protected int attack;
    protected int defense;
    protected ArrayList<Skills> skills = new ArrayList<>();
    protected int level = 0;
    protected int xpToLevelUp = 100;
    protected int charClass;

    Scanner scanner = new Scanner(System.in);

    public Characters() {
    }

    public Characters(String name, int life, int attack, int defense) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.defense = defense;
    }

    public void attackEnemy(Characters att, Characters def) {
        int damage = calculateDamage(att.getAttack(), def.getDefense());
        def.setLife(def.getLife() - damage);
    }

    public int selectSkill(Characters player) {
        System.out.println("Select your Skill: ");
        if(player.getCharClass() == 1) {
            System.out.println("1 - " + player.getSkills(0).getName() +  ": it enchant your sword with fire and add 10 damage per hit + 5 for 2 rounds");
            System.out.println("2 - " + player.getSkills(1).getName() +  ": it stuns your enemy for 1 round");
            return scanner.nextInt();
        }
        else if(player.getCharClass() == 2) {
            System.out.println("1 - " + player.getSkills(0).getName() +  ": you shot a arrow on fire and deals 75 damage + 5 for 1 round");
            System.out.println("2 - "+ player.getSkills(1).getName() +": you shot an arrow that stun your enemy for 2 rounds");
            return scanner.nextInt();
        }
        else {
            System.out.println("1 - "+ player.getSkills(0).getName() +": you shot a fireball that deals 100 damage + 10 for 1 round");
            System.out.println("2 - "+ player.getSkills(1).getName() +": make your enemy sleep for 1 round");
            return scanner.nextInt();
        }
    }

    public void useSkill(Characters player, int skill, Monsters monster) {
        int damage = calculateDamage(player.getSkills(skill).getBaseDamage(), monster.getDefense());
        monster.setLife(monster.getLife() - damage);
    }

    public void burningDamage(Monsters monster) {
        monster.setLife(monster.getLife() - 5);
    }

    public int calculateDamage(int att, int def){
        return att - def;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCharClass() {
        return charClass;
    }

    public void setCharClass(int charClass) {
        this.charClass = charClass;
    }

    public int getXpToLevelUp() {
        return xpToLevelUp;
    }

    public void setXpToLevelUp(int xpToLevelUp) {
        this.xpToLevelUp = xpToLevelUp;
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

    public Skills getSkills(int skill) {
        return this.skills.get(skill);
    }

    public void setSkills(Skills skills) {
        this.skills.add(skills);
    }
}
