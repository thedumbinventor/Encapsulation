class VendingMachine {
    private Product[] products;
    private int money;

    public VendingMachine() {
        products = new Product[] {
                new Snack("bhelpuri", 50),
                new Snack("mango", 75),
                new Drink("blackdog", 100),
                new Drink("Water", 75)
        };
        money = 0;
    }

    public void insertMoney(int money) {
        money += money;
    }

    public Product selectProduct(int productIndex) {
        if (productIndex < 0 || productIndex >= products.length) {
            System.out.println("not avavlable prodcutss");
            return null;
        }

        Product selectedProduct = products[productIndex];
        if (selectedProduct.getPrice() > money) {
            System.out.println("no paoisa");
            return null;
        }

        money -= selectedProduct.getPrice();
        System.out.println(selectedProduct.getName() + "!");
        return selectedProduct;
    }
}