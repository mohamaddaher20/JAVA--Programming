public class Animal {

    //declare properties/attributes
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
    public String makeSound(String sound){
        return String.format("A %s make %s sound",this.species,sound);
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
