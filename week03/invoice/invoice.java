package week03.invoice;

public class invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public static void main(String[] args) {
        invoice inv = new invoice("A101", "Keyboard", 5, 20.5);
        System.out.println(inv.getPartNumber());
        System.out.println(inv.getPartDescription());
        System.out.println(inv.getQuantity());
        System.out.println(inv.getPricePerItem());
    }
}
