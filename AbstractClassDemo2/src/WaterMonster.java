public class WaterMonster extends Monster implements Flyable, HiddenSkill {
    private int waterLevel;

    public WaterMonster(String name, int hp, int waterLevel) {
        super(name, hp);
        this.waterLevel = waterLevel;
    }

    // default constructor
    public WaterMonster() {
        super();
        this.waterLevel = 0;
    }

    @Override
    public void attack() {
        System.out.println("Water gun attack!");
        System.out.println("Shoot with water level " + waterLevel);
        
    }

    @Override
    public void defend() {
        System.out.println("Water shield defend!");
        System.out.println("Defends with water level " + waterLevel);
    }


    @Override
    public void fly() {
        System.out.println("Water monster is flied by fin!");
        
    }

    @Override
    public void land() {
        System.out.println("Water monster is landed on water!");    
    }

    @Override
    public void makeInvisible() {
        System.out.println("Water monster is invisible by water mist!");
        
    }

    @Override
    public void makeVisible() {
        System.out.println("Water monster is visible again!");
        
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }

    @Override
    public String toString() {
        return super.toString() + ", waterLevel: " + waterLevel;
    }

}
