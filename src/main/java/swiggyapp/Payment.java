package swiggyapp;

class Payment {
    private double amount;
    private String paymentMethod;

    public Payment(double amount, String paymentMethod) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Payment of Rs:" + amount + " made using " + paymentMethod;
    }
}
