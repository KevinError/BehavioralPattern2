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
        double insertedMoney = machine.getInsertedMoney();
        if (snack.getQuantity() > 0 && insertedMoney >= snack.getPrice()) {
            snack.decreaseQuantity(1);
            double change = insertedMoney - snack.getPrice();
        }
    }
}
