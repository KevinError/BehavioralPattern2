package vendingmachine;

public class DispensingSnackState implements StateOfVendingMachine{

    public DispensingSnackState() {
    }
    @Override
    public void selectSnack(VendingMachine machine, String snackName) {
        System.out.println("Snack is already selected");
    }
    @Override
    public void insertMoney(VendingMachine machine, double amount) {
        System.out.println("Money is already inserted");
    }
    @Override
    public void dispenseSnack(VendingMachine machine) {
        Snack snack = machine.getSelectedSnack();
        machine.getSnackDispenseHandler().handleRequest(snack);
        System.out.println(snack.getName() + " has been dispensed");
        machine.setState(new IdleState());
    }
}
