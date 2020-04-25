package p1.Entity;


public class CheckOut {
    private Report report = new Report();

    public Bill checkout(Customer customer) {
        return checkout(customer.getCart());
    }

    public Bill checkout(Cart cart) {
        Bill bill = new Bill(cart);
        cart.getCustomer().addBill(bill);
        cart.getCustomer().emptyCart();
        cart.empty();

        this.report.addBill(bill);

        return bill;
    }

    public Report getReport() {
        return report;
    }
}
