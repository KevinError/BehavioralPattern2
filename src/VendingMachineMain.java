import vendingmachine.*;
public class VendingMachineMain {
    public static void main(String[] args) {

        VendingMachine machine = new VendingMachine();
        machine.selectSnack("Coke");
        machine.insertMoney(5);
        machine.selectSnack("Pepsi");
        machine.insertMoney(5);
        machine.selectSnack("Doritos");
        machine.insertMoney(5);
        machine.selectSnack("Snickers");
        machine.insertMoney(5);
        machine.selectSnack("KitKat");
        machine.insertMoney(5);
        machine.selectSnack("Cheetos");
        machine.insertMoney(5);
    }
}