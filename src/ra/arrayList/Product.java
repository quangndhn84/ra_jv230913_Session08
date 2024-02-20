package ra.arrayList;

public class Product {
    private String productId;
    private String productName;
    private float price;
    private boolean status;

    public Product() {
    }

    public Product(String productId, String productName, float price, boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.status = status;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String toString() {
        return this.productId + "-" + this.productName + "-" + this.price + "-" + this.status;
    }
}
