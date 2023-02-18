public class Main {
    public static void main(String[] args) {

    //Step 7 and 8

        //declare the array
        Animal[] zoo = new Animal[3];

        //list values for the array
        Animal cow = new Animal("cow", 400,"farm", false);
        Animal lion  = new Animal("lion", 300,"Jungle", true);
        Animal dog = new Animal("dog", 100,"Home", false);

        //add the three objects to the zoo array
        zoo[0] = cow;
        zoo[1] = lion;
        zoo[2] = dog;

        System.out.println(cow.toString());
        System.out.println(cow.feedAnimal("Grass"));

        System.out.println(lion.toString());
        System.out.println(lion.makeSound("RARRRRR"));









    }
}