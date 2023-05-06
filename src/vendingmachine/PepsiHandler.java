package vendingmachine;

public class PepsiHandler extends SnackDispenseHandler{
    public PepsiHandler(SnackDispenseHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Snack snack) {
        if (snack.getName().equals("Pepsi")) {
            System.out.println("Handling Pepsi Request");
            if(snack.isAvailable()) {
                snack.loseQuantity();
                System.out.println("Successfully handled");
            } else {
                System.out.println(snack.getName() +" is not available");
            }
        } else {
            System.out.println("Passing from Pepsi");
            super.handleRequest(snack);
        }
    }
}
