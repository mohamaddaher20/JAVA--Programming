public class Cat extends Animal{

    //Those are the unique properties for the cat
    public int whiskersLength;

    //how can i add the general or common properties from the main class(Animal)
    //we add extends and the name of the class

    //lets create a Cat constructor
    public Cat(String species,double maxWeight, String habitat, boolean isEndangered, int whiskersLength) {
        //before
//        this.setSpecies(species);
//        this.setMaxWeight(maxWeight);
//        this.setHabitat(habitat);
//        this.setEndangered(isEndangered)
        super(species,maxWeight, habitat,isEndangered);
        this.whiskersLength= whiskersLength;
    }

    //create my own make sound for the cat
    //Inside the child class if we want to access any of it's properties if they are private, we need to use super or the getter.
    //we cant use this.species

    ////This is the first polymorphism
    public String makeSound() {
        return String.format("A %s makes %s sound",super.getSpecies(),"Meow");
    }

    //This is the second polymorphism/ CODE REUSIBILITY
    public String toString() {
        return super.toString() + " My whiskers length is " + this.whiskersLength;
    }

}
