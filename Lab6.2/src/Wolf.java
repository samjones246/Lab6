public class Wolf extends Animal{

    public Wolf(String name, int age) {
        super(name, age);
    }

    // Implementation of Animal.makeNoise
    @Override
    public void makeNoise(){
        System.out.println(name + " says: Woof!");
    }
}
