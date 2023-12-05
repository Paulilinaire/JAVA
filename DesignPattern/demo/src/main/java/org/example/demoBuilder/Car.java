package org.example.demoBuilder;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.price = builder.price;
    }

    public static class Builder{
        private String brand;
        private String model;
        private int year;
        private double price;

        public Builder brand(String brand){
            this.brand = brand;
            return this;
        }

        public Builder model(String model){
            this.model = model;
            return this;
        }

        public Builder price(double price){
            this.price = price;
            return this;
        }

        public Builder year(int year){
            this.year = year;
            return this;
        }
        // return this, return Builder object

        public Car build(){
            return new Car (this);
        } // this method convert Builder object in a Car object

    }



    @Override
    public String toString() {
        return "Car: " +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price;
    }
}
