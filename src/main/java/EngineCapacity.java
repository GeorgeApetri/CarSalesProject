public class EngineCapacity {

    private int typeCapacity;
    private int priceCapacity;

    public EngineCapacity(int typeCapacity, int priceCapacity) {
        this.typeCapacity = typeCapacity;
        this.priceCapacity = priceCapacity;
    }

    public int getTypeCapacity() {
        return typeCapacity;
    }

    public void setTypeCapacity(int typeCapacity) {
        this.typeCapacity = typeCapacity;
    }

    public int getPriceCapacity() {
        return priceCapacity;
    }

    public void setPriceCapacity(int priceCapacity) {
        this.priceCapacity = priceCapacity;
    }
}