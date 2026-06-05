public abstract class Monster {
    private String name;
    private int hp;

    public Monster(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    // default constructor
    public Monster() {
        this.name = "Unknown";
        this.hp = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "name: " + name + ", hp: " + hp;
    }

    // abstract method, every subclass must implement this method
    public abstract void attack();

    // abstract method, every subclass must implement this method
    public abstract void defend();

}
