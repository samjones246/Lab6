public abstract class Animal {

    String name;
    int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    // Abstract method implemented in subclasses
    public abstract void makeNoise();
}
