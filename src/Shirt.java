public class Shirt extends Clothing implements ShopFeatures {

    public Shirt(String brand, String color, double price) {
        super.brand = brand;
        super.color = color;
        super.price = price;
    }

    @Override
    public String getProductNumber() {
        return null;
    }
    
}
