package homework_14;

public class Items {

        private int id;
        private String name;
        private double price;
        private int count;
        private ETypeItem type;
        private static int  nextId = 1;

     public Items( String name, double price, int count, ETypeItem type) {
         this.id = nextId++;
          this.name = name;
           this.price = price;
           this.count = count;
           this.type = type;
        }


    public int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }
    public ETypeItem getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", type=" + type +
                '}';
    }
}

