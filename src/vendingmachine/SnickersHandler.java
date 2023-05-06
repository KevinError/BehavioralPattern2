package vendingmachine;

public class SnickersHandler extends SnackDispenseHandler{
    public SnickersHandler(SnackDispenseHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Snack snack) {
        if (snack.getName().equals("Snickers")) {
            System.out.println("Handling Snickers Request");
            if(snack.isAvailable()) {
                snack.loseQuantity();
                System.out.println("Successfully handled");
            } else {
                System.out.println(snack.getName() +" is not available");
            }
        } else {
            System.out.println("Passing from Snickers");
            super.handleRequest(snack);
        }
    }
}
