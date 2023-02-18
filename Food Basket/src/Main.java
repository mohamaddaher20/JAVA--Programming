import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //instances of the food class
        Food[] picnicBasket = new Food[3];
        picnicBasket[0] = new Food("Banana", "Fruits");
        picnicBasket[1] = new Food("Carrot","Vegetable");
        picnicBasket[2] = new Food("Milk", "Diary");

        //for loop to check if its vegetables then call denyIt
        for (int i=0 ; i<picnicBasket.length ; i++){
            Food currentFood = picnicBasket[i];
            if(currentFood.type.equals("Vegetable")) {
                System.out.println(currentFood.denyIt());
            }
            else {
                System.out.println(currentFood.eatIt());
            }

        }

    }
}

