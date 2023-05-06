package vendingmachine;

public class IdleState implements StateOfVendingMachine{

    public IdleState() {
    }

    @Override
    public void selectSnack(VendingMachine machine, String snackName) {
        Snack snack = machine.selectSnackByName(snackName);
        if (snack.isAvailable()) {
            System.out.println("Selected snack: " + snack.getName());
            machine.setSnack(snack);
            machine.setState((StateOfVendingMachine) new WaitingForMoneyState());
        } else {
            System.out.println(snack.getName() + "'s quantity is 0");
        }
    }

    @Override
    public void insertMoney(VendingMachine machine, double amount) {
        System.out.println("Please select a snack first");
    }

    @Override
    public void dispenseSnack(VendingMachine machine) {
        System.out.println("Please select a snack first");
    }
}
