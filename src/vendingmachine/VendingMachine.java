package vendingmachine;

import javax.swing.plaf.nimbus.State;
import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private Map<String, Snack> snacks;
    private StateOfVendingMachine state = new IdleState();
    private SnackDispenseHandler snackDispenseHandler;

    public VendingMachine() {
        snacks = new HashMap<>();
        snacks.put("Coke", new Snack("Coke", 1.25, 5));
        snacks.put("Pepsi",new Snack("Pepsi", 1.50, 3));
        snacks.put("Cheetos", new Snack("Cheetos", 1.00, 2));
        snacks.put("Doritos",new Snack("Doritos", 1.50, 4));
        snacks.put("KitKat", new Snack("KitKat", 1.25, 6));
        snacks.put("Snickers",new Snack("Snickers", 1.50, 0));
        snackDispenseHandler = new SnackDispenseHandler();

    }

    public Snack selectSnackByName(String snackName) {
        return snacks.get(snackName);
    }

    public Snack getSelectedSnack() {
        return snackDispenseHandler;
    }

    public void selectSnack(String snackName){
        getState().selectSnack(this, snackName);
    }

    public void insertMoney(double amount) {
        getState().insertMoney(this, amount);
    }

    public void dispenseSnack() {
        getState().dispenseSnack(this);
    }

    public SnackDispenseHandler getSnackDispenseHandler() {
        return snackDispenseHandler;
    }

    public void setState(StateOfVendingMachine state) {
        this.state = state;
    }

    public StateOfVendingMachine getState() {
        return this.state;
    }
}
