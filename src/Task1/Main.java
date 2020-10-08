package Task1;
public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Jonathan", 19);
        Car car = new Car("Nissan", "Z10", 1998, "hatchback");
        Car car1 = new Car("Cadillac", "Deville",2002,"sedan");
        car.setDriver(driver);
        car1.setDriver(driver);
        System.out.println(car.toString()+driver.toString());
        System.out.println(car1.toString()+driver.toString());


    }
}