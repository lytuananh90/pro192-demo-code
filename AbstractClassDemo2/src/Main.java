public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("-- Welcome to the Monster Game! --");
        // create a water monster
        WaterMonster waterMonster = new WaterMonster("Giant Fish", 100, 5);
        System.out.println(waterMonster.toString());
        // attack and defend
        waterMonster.attack();
        waterMonster.defend();

        // fly and land
        waterMonster.fly();
        waterMonster.land();
       
    }
}
