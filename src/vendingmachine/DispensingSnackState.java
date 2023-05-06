package vendingmachine;

public class DispensingSnackState {
    private VendingMachine vendingMachine;

    public DispensingSnackState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public void selectSnack(String snackName) {
        System.out.println("Snack already selected");
    }

    public void insertMoney(double amount) {
        System.out.println("Money already inserted");
    }

    public void dispenseSnack() {
        Snack snack = vendingMachine.getSelectedSnack();
        double insertedMoney = vendingMachine.getInsertedMoney();
        if (snack.getQuantity() > 0 && insertedMoney >= snack.getPrice()) {
            snack.decreaseQuantity(1);
            double change = insertedMoney - snack.getPrice();
            System
}
