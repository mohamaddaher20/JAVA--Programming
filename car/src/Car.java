public class Car {

    //This is the blueprint of any new class. It contain the following

    //1. The properties

    //we have not assigned any value for these yet
    public String carsModel;
    public String carsColor;
    public Double carsPrice;

    //2. The constructors
    //A. The built-in default constructor. it will get default values based on datatype

    //B. The non parametrized constructor (constructor without parameters) it will overwrite the default values
    public Car(){
        this.carsModel="Empty";
        this.carsColor="NA";
        this.carsPrice= 0.0;
    }

    //C. The parametrized constructor(constructor with parameter)
    public Car(String pCarsModel, String pCarsColor, Double pCarsPrice){
        this.carsModel = pCarsModel;
        this.carsColor = pCarsColor;
        this.carsPrice = pCarsPrice;
    }


    //3. The methods

    //void does not return
    public void carsReport() {
        System.out.println(this.carsModel);
        System.out.println(this.carsColor);
        System.out.println(this.carsPrice);

    }

    //it returns value and needs to be a datatype of string the same in this case it will not return integer
    public String turnRight(){
        return "Turn Right";
    }







}