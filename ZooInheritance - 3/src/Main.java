import java.util.ArrayList;

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
        System.out.println(lion.makeSound());

        //NEW STUFF///////////////////*************************
        //This is passing all the hard coded values for all the animals, which is not correct. /////////////////
        //so instead i will leave the brackets empty so it can get the correct sound from the if-else in animal class
        for (int i = 0; i < zoo.length; i++) {
            System.out.println(zoo[i].toString());
            System.out.println(zoo[i].feedAnimal("Grass"));
            System.out.println(zoo[i].makeSound());
        }

        System.out.println("\nINHERITANCE PART\n");
        Animal youssefCat = new Animal("Cat", 250, "Youssef home", false);

        //FROM HERE WE ARE DEALING WITH INHERITANCE PROGRAMMING
        ///////////////////////////////////////**************************************88
        Cat myCat = new Cat("Cat",250.0, "Home", false, 4);
        //before it did not print the whiskers, but now it will print the whiskers
        System.out.println(myCat.toString());


        //Using arrayList instead of array of objects
        Animal myDog = new Animal("Dog", 20, "Home", false);

        ArrayList<Animal> zoo2 = new ArrayList<>();
        zoo2.add(myDog);        //Animal object
        zoo2.add(youssefCat);   //Animal object
        zoo2.add(myCat);        //Cat object

        //In normal array we can use this to print specific indixes
        System.out.println(zoo[0]);

        //But in arrayList we have a method called get
        System.out.println(zoo2.get(0).makeSound());
        System.out.println(zoo2.get(1).makeSound());

        for (Animal myAnimal:zoo2) {
            System.out.println(myAnimal.makeSound());
        }

    }
}