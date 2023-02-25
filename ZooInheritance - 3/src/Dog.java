public class Dog extends Animal{


    public String makeSound() { //The symbol means this is the first polymorism
        return String.format("A %s makes %s sound", super.getSpecies(), "Woof Woof");
    }


}
