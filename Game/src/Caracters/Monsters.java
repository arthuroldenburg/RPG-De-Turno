package Caracters;

public class Monsters extends Characters {
    protected int xpDrop;
    protected String type;

    public Monsters(){}

    public Monsters(String name, int life, int attack, int defense, int xpDrop, String type) {
        super(name, life, attack, defense);
        this.xpDrop = xpDrop;
        this.type = type;
    }

    public int getXpDrop() {
        return xpDrop;
    }

    public void setXpDrop(int xpDrop) {
        this.xpDrop = xpDrop;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
