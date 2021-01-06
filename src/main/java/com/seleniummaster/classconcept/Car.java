package com.seleniummaster.classconcept;

public class Car implements Comparable<Car> {
    private String brand;
    private String made;
    private String color;
    private int mileAge;
    private long price;
    private int year;
    // define getter and setter method

    // default constructor
    public Car() {
    }

    public Car(String brand, String color, long price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    //constructor with arguments
    public Car(String brand, String made, String color, int mileAge, long price, int year) {
        this.brand = brand;
        this.made = made;
        this.color = color;
        this.mileAge = mileAge;
        this.price = price;
        this.year = year;
    }

    public Car(String brand, String made, String color, int year) {
        this.brand = brand;
        this.made = made;
        this.color = color;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileAge() {
        return mileAge;
    }

    public void setMileAge(int mileAge) {
        this.mileAge = mileAge;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }


    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", made='" + made + '\'' +
                ", color='" + color + '\'' +
                ", mileAge=" + mileAge +
                ", price=" + price +
                ", year=" + year+"\n";
    }
    public String CarInfo(){
        return brand+", "+made+", "+color+", "+mileAge+", "+price;
    }

    @Override
    public int compareTo(Car car) {
        if (price==car.price) {
            return 0;
        }else if (price>car.price){
            return 1;
        }else
            return -1;
    }
}
