package vendingmachine;

public class WaitingForMoneyState implements StateOfVendingMachine{

    public WaitingForMoneyState() {
    }

    @Override
    public void selectSnack(VendingMachine machine, String snackName) {
        System.out.println("Snack is already selected");
    }
    @Override
    public void insertMoney(VendingMachine machine, double amount) {
        double snackPrice = machine.getSelectedSnack().getPrice();
        if (amount >= snackPrice) {
            machine.setInsertedMoney(amount);
            machine.setState(new DispensingSnackState());
            System.out.println("Money inserted: $" + amount);
        } else {
            System.out.println("Insufficient money inserted");
        }
    }

    @Override
    public void dispenseSnack(VendingMachine machine) {
        System.out.println("Please insert the money first");
    }

}
