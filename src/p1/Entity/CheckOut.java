package p1.Entity;


public class CheckOut {
    public Bill checkout (Customer customer) {
        return checkout(customer.getCart());
    }

    public Bill checkout(Cart cart) {
        Bill bill = new Bill(cart);
        cart.getCustomer().addBill(bill);
        cart.getCustomer().emptyCart();
        cart.empty();

        return bill;
    }
}
