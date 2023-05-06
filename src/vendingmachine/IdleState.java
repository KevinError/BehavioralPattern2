package vendingmachine;

public class IdleState implements StateOfVendingMachine{
    private VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectSnack(String snackName) {
        Snack snack = vendingMachine.getSnackByName(snackName);
        if (snack != null) {
            vendingMachine.setSelectedSnack(snack);
            System.out.println("Selected snack: " + snack.getName());
            vendingMachine.setState(vendingMachine.getWaitingForMoneyState());
        } else {
            System.out.println("Invalid snack selection");
        }
    }

    @Override
    public void insertMoney(double amount) {
        System.out.println("Please select a snack first");
    }

    @Override
    public void dispenseSnack() {
        System.out.println("Please select a snack first");
    }
}
