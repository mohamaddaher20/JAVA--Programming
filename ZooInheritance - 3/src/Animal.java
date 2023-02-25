public class Animal {

    //declare properties/attributes
    ////NEW STUFF///////////////////////////////////////////////////
    //these are general properties that apply to all, the unique properties for each animal will go in thier own class.
    private String species;
    private double maxWeight;
    private String habitat;
    private boolean isEndangered;

    //Default constructors(Constructors without parameters)
    public Animal() {
        this.setSpecies("Cat");
        this.setMaxWeight(0.0);
        this.setHabitat("Home");
        this.setEndangered(false);
    }

    public Animal(String species, double maxWeight, String habitat, boolean isEndangered){
        this.setSpecies(species);
        this.setMaxWeight(maxWeight);
        this.setHabitat(habitat);
        this.setEndangered(isEndangered);
    }

    //Encapsulation Getters and Setters methods

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }

    //Method to print the feed
    public String feedAnimal(String food){
        return String.format("Feed a %s a %s", this.species, food);
    }

    //Method to make the sound
//    public String makeSound(String sound){
//        return String.format("A %s make %s sound",this.species,sound);
//    }

    //BEFORE AND AFTER FOR INHERITANCE/////////////////////////////////////////*************
    //if we have 20 species i cant use IF-ELSE statments for all
    public String makeSound(){
        /*String sound = "unknown";
        if(this.species.equals("Cow"))
            sound = "Meow";
        if(this.species.equals("dog"))
            sound="Woof";
        if(this.species.equals("lion"))
            sound="Raarrr";
        return String.format("A %s make %s sound",this.species,sound); */
        return String.format("A %s makes %s sound",this.species,"Unknown");
    }

    public String toString() {
        String endangered = "Not Endangered";
        if (this.isEndangered) {
            endangered = "an Endengered";
        }
        String report = String.format("I am a %.2fib %s that lives in the %s. I am %s species",this.maxWeight, this.species, this.habitat,endangered);
        return report;
    }


}
