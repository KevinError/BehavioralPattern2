package vendingmachine;

public class KitKatHandler extends SnackDispenseHandler{
    public KitKatHandler(SnackDispenseHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Snack snack) {
        if (snack.getName().equals("KitKat")) {
            System.out.println("Handling KitKat Request");
            if(snack.isAvailable()) {
                snack.loseQuantity();
                System.out.println("Successfully handled");
            } else {
                System.out.println(snack.getName() +" is not available");
            }
        } else {
            System.out.println("Passing from KitKat");
            super.handleRequest(snack);
        }
    }
}
