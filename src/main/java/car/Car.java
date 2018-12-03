package car;

public class Car implements Comparable<Car> {

    private int idCar;
    private String category;
    private String combustible;
    private String transmission;
    private int engineCapacity;
    private int tankCapacity;
    private double fuelConsumption;
    private int emissions;
    private String color;
    private int price;

    public Car() {

    }

    public Car(int idCar, String category, String combustible, String transmission, int engineCapacity,
               int tankCapacity, double fuelConsumption, int emissions, String color, int price) {

        this.idCar = idCar;
        this.category = category;
        this.combustible = combustible;
        this.transmission = transmission;
        this.engineCapacity = engineCapacity;
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;
        this.emissions = emissions;
        this.color = color;
        this.price = price;

    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getEmissions() {
        return emissions;
    }

    public void setEmissions(int emissions) {
        this.emissions = emissions;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int compareTo(Car o) {
        return idCar - o.idCar;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return idCar + "\t" + category + "\t" + combustible + "\t" + transmission + "\t" + engineCapacity + "\t"
                + tankCapacity + "\t" + fuelConsumption + "\t" + emissions + "\t" + color + "\t" + price;
    }

}