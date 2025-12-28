package homework_14;

public class Electronic extends Items{
    private int warrantyMonths;

    public  Electronic(int warrantyMonths,String name, double price, int count,ETypeItem type) {
        super(name, price, count, type);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }
    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String toString() {
        return super.toString() +
                " , warrantyMonths=" + warrantyMonths +
                '}';
    }
}
