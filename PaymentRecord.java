public class PaymentRecord {
    private String category;
    private String name;
    private String id;
    private double amount;
    private double paid;
    private double amountLeft;

    public PaymentRecord(String category, String name, String id, double amount, double paid) {
        this.category = category;
        this.name = name;
        this.id = id;
        this.amount = amount;
        this.paid = paid;
        this.amountLeft = amount - paid;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public double getPaid() {
        return paid;
    }

    public double getAmountLeft() {
        return amountLeft;
    }
}