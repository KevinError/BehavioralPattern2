package vendingmachine;

public class DoritosHandler extends SnackDispenseHandler{
    public DoritosHandler(SnackDispenseHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Snack snack) {
        if (snack.getName().equals("Doritos")) {
            System.out.println("Handling Doritos Request");
            if(snack.isAvailable()) {
                snack.loseQuantity();
                System.out.println("Successfully handled");
            } else {
                System.out.println(snack.getName() +" is not available");
            }
        } else {
            System.out.println("Passing from Doritos");
            super.handleRequest(snack);
        }
    }
}
