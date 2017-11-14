public class Main {
    public static void main(String[] args) {
        System.out.println("----Animals----");
        System.out.println("Creating Wolf...");
        Wolf myWolf = new Wolf("Wolfgang", 6);                                  // Wolf instantiated
        System.out.println("Name: "+myWolf.getName()+", Age: "+myWolf.getAge());
        System.out.println("Creating Parrot...");
        Parrot myParrot = new Parrot("Polly", 43);                              // Parrot instantiated
        System.out.println("Name: "+myParrot.getName()+", Age: "+myParrot.getAge());
        System.out.println("Calling makeNoise methods...");
        myParrot.makeNoise();
        myWolf.makeNoise();

        System.out.println("----Food----");
        System.out.println("Creating Meat...");
        System.out.println("Name: Steak");
        Meat myMeat = new Meat("Steak");                                              // Meat instantiated
        System.out.println("Creating Plant...");
        System.out.println("Name: Grass");
        Plant myPlant = new Plant("Grass");                                           // Plant instantiated
    }
}
