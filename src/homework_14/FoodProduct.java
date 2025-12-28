package homework_14;

public class FoodProduct extends Items{
    private String expirationDate;

    public  FoodProduct(String expirationDate,String name, double price, int count, ETypeItem type) {
        super( name, price, count, type);
        this.expirationDate = expirationDate;
    }
    public String getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "FoodProduct{" +
                "expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
