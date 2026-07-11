package static_22;

public class Car {

 private String model;
 private int year;

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public static class Builder{
     private String model;
     private int year;

     public Builder model(String model){
         this.model=model;
         return this;
     }

     public Builder year(int year){
         this.year=year;
         return this;
     }


     public Car build(){
         Car car = new Car();
         car.model = model;
         car.year = year;
         return car;
     }


    }
}
