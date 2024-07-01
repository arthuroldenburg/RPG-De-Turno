package Caracters;

public class Skills {
    protected String name;
    protected String type;
    protected int baseDamage;

    public Skills() {}

    public Skills(String name, String type, int baseDamage) {
        this.name = name;
        this.type = type;
        this.baseDamage = baseDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }
}
