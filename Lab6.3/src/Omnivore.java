public abstract class Omnivore extends Animal {

    public Omnivore(String name, int age) {
        super(name, age);
    }

    // No need to throw an exception as omnivores can eat any food
    @Override
    public void eat(Food food){
        System.out.println(name + " is eating " + food.getName());
    }
}
