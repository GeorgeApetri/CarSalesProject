public class Car {

//    category: suv, hatchback, sedan
    private String category;
//    combustible: diesel, benzine
    private String combustible;
//    transmission: manual, automatic
    private String transmission;
//    engineCapacity: 1.4, 1.6 , 2.0
    private Double engineCapacity;
//    tankCapacity: 50l, 60l, 70l
    private Double tankCapacity;
//    fuelConsumption: 6%, 8%, 10%
    private Double fuelConsumption;
//    emissions: 90g/km, 100g/km, 110g/km
    private Double emissions;
//    color: red, blue, black
    private String color;

    public Car(){

    }

    public Car(String category, String combustible, String transmission, Double engineCapacity,
               Double tankCapacity, Double fuelConsumption, Double emissions, String color) {
        this.category = category;
        this.combustible = combustible;
        this.transmission = transmission;
        this.engineCapacity = engineCapacity;
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;
        this.emissions = emissions;
        this.color = color;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setEngineCapacity(Double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setTankCapacity(Double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public void setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setEmissions(Double emissions) {
        this.emissions = emissions;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public String getCombustible() {
        return combustible;
    }

    public String getTransmission() {
        return transmission;
    }

    public Double getEngineCapacity() {
        return engineCapacity;
    }

    public Double getTankCapacity() {
        return tankCapacity;
    }

    public Double getFuelConsumption() {
        return fuelConsumption;
    }

    public Double getEmissions() {
        return emissions;
    }

    public String getColor() {
        return color;
    }
}
