package vendingmachine;

public class WaitingForMoneyState {
    private VendingMachine vendingMachine;

    public WaitingForMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public void selectSnack(String snackName) {
        System.out.println("Snack already selected");
    }

    public void insertMoney(double amount) {
        double snackPrice = vendingMachine.getSelectedSnack().getPrice();
        if (amount >= snackPrice) {
            vendingMachine.setInsertedMoney(amount);
            vendingMachine.setCurrentState(vendingMachine.getDispensingSnackState());
            System.out.println("Money inserted: $" + amount);
        } else {
            System.out.println("Insufficient money inserted");
        }
    }

    public void dispenseSnack() {
        System.out.println("Please insert money first");
    }

}
