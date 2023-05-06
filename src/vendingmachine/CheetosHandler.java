package vendingmachine;

public class CheetosHandler extends SnackDispenseHandler{

    public CheetosHandler(SnackDispenseHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Snack snack) {
        if (snack.getName().equals("Cheetos")) {
            System.out.println("Handling Cheetos Request");
            if(snack.isAvailable()) {
                snack.loseQuantity();
                System.out.println("Successfully handled");
            } else {
                System.out.println(snack.getName() +" is not available");
            }
        } else {
            System.out.println("Passing from Cheetos");
            super.handleRequest(snack);
        }
    }
}
