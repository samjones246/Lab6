public class Main {

    public static void main(String[] args) {
        Wolf myWolf = new Wolf("Wolfgang", 6);                              // Wolf instantiated
        System.out.println("(Wolf) Name: "+myWolf.getName()+", Age: "+myWolf.getAge());
        Parrot myParrot = new Parrot("Polly", 43);                          // Parrot instantiated
        System.out.println("(Parrot) Name: "+myParrot.getName()+", Age: "+myParrot.getAge());
        Cow myCow = new Cow("Bessy", 2);                                    // Cow instantiated
        System.out.println("(Cow) Name: "+myCow.getName()+", Age: "+myCow.getAge());
        System.out.println("---Feeding Time---");
        Meat steak = new Meat("Steak");                                          // Meat instantiated
        Plant grass = new Plant("Grass");                                        // Plant instantiated

        // Try feeding wrong food types. Will result in an exception
        try {
            myWolf.eat(grass);
            myCow.eat(steak);
        }catch (Exception e){
            System.err.println(e);
        }
        myParrot.eat(steak);
    }
}
