public class Main {
    public static void main(String[] args) {
        Wolf myWolf = new Wolf("Wolfgang", 6); // Wolf instantiated
        System.out.println("Name: "+myWolf.getName()+", Age: "+myWolf.getAge());
        Parrot myParrot = new Parrot("Polly", 43); // Parrot instantiated
        System.out.println("Name: "+myParrot.getName()+", Age: "+myParrot.getAge());
        System.out.println("Calling makeNoise methods...");
        myParrot.makeNoise();
        myWolf.makeNoise();
    }
}
