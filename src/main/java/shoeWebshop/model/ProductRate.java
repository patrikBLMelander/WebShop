package shoeWebshop.model;

public class ProductRate {
    int id;
    Product productId;
    Customer customerId;
    Rate rateId;
    String review;

    public ProductRate(int id, Product productId, Customer customer, Rate rating, String review) {
        this.id = id;
        this.productId = productId;
        this.customerId = customer;
        this.rateId = rating;
        this.review = review;
    }
}
