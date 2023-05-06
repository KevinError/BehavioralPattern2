package vendingmachine;

public class CokeHandler extends SnackDispenseHandler{

    public CokeHandler(SnackDispenseHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Snack snack) {
        if (snack.getName().equals("Coke")) {
            System.out.println("Handling Coke Request");
            if(snack.isAvailable()) {
                snack.loseQuantity();
                System.out.println("Successfully handled");
            } else {
                System.out.println(snack.getName() +" is not available");
            }
        } else {
            System.out.println("Passing from Coke");
            super.handleRequest(snack);
        }
    }
}
