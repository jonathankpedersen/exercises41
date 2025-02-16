package Task1;

public class Car {
    String make;
    String model;
    int year;
    String bodyStyle;
    Driver driver;

    public Car(String make, String model, int year, String bodyStyle) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;

    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
         this.driver = driver;
    }

    @Override
    public String toString() {
        return ("Make: "+make+". Model: "+model+" ("+year+"), BodyStyle; "+bodyStyle);
    }
}
