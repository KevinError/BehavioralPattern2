package vendingmachine;

public class VendingMachine {
    private Snack[] snacks;
    private int currentState;
    private StateOfVendingMachine[] states;
    private SnackDispenseHandler snackDispenseHandler;

    public VendingMachine() {
        snacks = new Snack[]{
                new Snack("Coke", 1.25, 5),
                new Snack("Pepsi", 1.50, 3),
                new Snack("Cheetos", 1.00, 2),
                new Snack("Doritos", 1.50, 4),
                new Snack("KitKat", 1.25, 6),
                new Snack("Snickers", 1.50, 0)
        };
        currentState = 0;
        states = new StateOfVendingMachine[]{
                new IdleState(this),
                new WaitingForMoneyState(this),
                new DispensingSnackState(this)
        };
        snackDispenseHandler = new CokeDispenseHandler(new PepsiDispenseHandler(new CheetosDispenseHandler(
                new DoritosDispenseHandler(new KitKatDispenseHandler(new SnickersDispenseHandler(null))))));
    }

    public void selectSnack(int index) {
        currentState = states[currentState].selectSnack(index);
    }

    public void insertMoney(double amount) {
        currentState = states[currentState].insertMoney(amount);
    }

    public void dispenseSnack() {
        currentState = states[currentState].dispenseSnack();
    }

    public Snack[] getSnacks() {
        return snacks;
    }

    public Snack getSnack(int index) {
        return snacks[index];
    }

    public SnackDispenseHandler getSnackDispenseHandler() {
        return snackDispenseHandler;
    }

    public void setState(int state) {
        currentState = state;
    }

    public int getState() {
        return currentState;
    }
}
