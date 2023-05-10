package Template_method;

public class Client {
    public static void main(String[] args) {
        Tea myTea = new Tea();  //make a specific empty object
        myTea.prepareRecipe();  //call the template method

        System.out.println();
        Coffee myCoffee = new Coffee();  //make a specific empty object
        myCoffee.prepareRecipe();  //call the template method
    }
}
