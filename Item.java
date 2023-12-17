public class Item {
    // Declare private instance variables to store the price excluding tax and the VAT rate of the item
    private double priceExcludingTax;
    private double vat;

    // Constructor that takes parameters
    public Item(double priceExcludingTax, double vat) {
        // Initialize the 'priceExcludingTax' and 'vat' variables
        this.priceExcludingTax = priceExcludingTax;
        this.vat = vat;
    }

    // Method to calculate the total price including tax
    public void total() {
        // Calculate the total price including tax
        double totalPrice = this.priceExcludingTax * (1 + this.vat / 100);
        
        // Display information about the item: price excluding tax, VAT rate, and total price
        System.out.println("The price excluding tax of the item is: " + this.priceExcludingTax);
        System.out.println("The VAT rate is: " + this.vat + "%");
        System.out.println("The total price of the item is: " + totalPrice);
    }

    public static void main(String[] args) {
        // Creates an instance (object) of the Item class with a price of 50 and a VAT rate of 3.
        Item item1 = new Item(50, 3);

        // Calls the total() method of the item1 object to calculate and display the total price of the item.
        item1.total();
    }
}
