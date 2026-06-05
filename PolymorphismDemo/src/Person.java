public class Person {
    // id, name
    private String id;
    private String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void registerAccount() {
        System.out.println("Registering account for " + name);
    }

    // overloading method registerAccount with different parameters
    public void registerAccount(String location) {
        System.out.println("Registering account for " + name + " at " + location);
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name;
    }   
}
