package homework_14;

public class Clothing extends Items{
    private String size;
    private EGenderCloth gender;

    public  Clothing(String size, String name, double price, int count, ETypeItem type, EGenderCloth gender) {
        super(name, price, count, type);
        this.size = size;
        this.gender = gender;
    }


    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size='" + size + '\'' +
                ", gender=" + gender +
                '}';
    }
}
