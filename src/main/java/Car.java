public class Car {

    private Category category;
    private Combustible combustible;
    private Transmission transmission;
    private EngineCapacity engineCapacity;
    private TankCapacity tankCapacity;
    private FuelConsumption fuelConsumption;
    private Double emissions;
    private String[] color = {"White", "Grey", "Red", "Black"};

    public Car(Category category, Combustible combustible, Transmission transmission, EngineCapacity engineCapacity,
               TankCapacity tankCapacity, FuelConsumption fuelConsumption, Double emissions, String[] color) {

        this.category = category;
        this.combustible = combustible;
        this.transmission = transmission;
        this.engineCapacity = engineCapacity;
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;
        this.emissions = emissions;
        this.color = color;

    }

}