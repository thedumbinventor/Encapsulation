class Main {
    public static void main(String[] args) {
        VendingMachine vendingmachine = new VendingMachine();
        vendingmachine.insertMoney(100);
        vendingmachine.selectProduct(0);
        vendingmachine.insertMoney(50);
        vendingmachine.selectProduct(1);
        vendingmachine.selectProduct(2);

    }
}