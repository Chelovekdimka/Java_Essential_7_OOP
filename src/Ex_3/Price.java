package Ex_3;

public class Price {
    private String productName;
    private String nameOfShop;
    private double priceInUAH;

    public Price(String productName, String nameOfShop, double priceInUAH) {
        this.productName = productName;
        this.nameOfShop = nameOfShop;
        this.priceInUAH = priceInUAH;
    }

    public String getNameOfShop() {
        return nameOfShop;
    }

    public String getProductName() {
        return productName;
    }

    public double getPriceInUAH() {
        return priceInUAH;
    }
}
