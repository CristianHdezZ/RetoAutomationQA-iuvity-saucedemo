package co.com.iuvity.certification.front.model;

public class Product {
    private String product;
    private String firstname;
    private String lastname;
    private String postalCode;

    public Product(String product, String firstname, String lastname, String postalCode) {
        this.product = product;
        this.firstname = firstname;
        this.lastname = lastname;
        this.postalCode = postalCode;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
