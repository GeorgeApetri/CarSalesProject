public class TankCapacity {

    private int typeTankCapacity;
    private int priceTankCapacity;

    public TankCapacity(int typeTankCapacity, int priceTankCapacity) {
        this.typeTankCapacity = typeTankCapacity;
        this.priceTankCapacity = priceTankCapacity;
    }

    public int getTypeTankCapacity() {
        return typeTankCapacity;
    }

    public void setTypeTankCapacity(int typeTankCapacity) {
        this.typeTankCapacity = typeTankCapacity;
    }

    public int getPriceTankCapacity() {
        return priceTankCapacity;
    }

    public void setPriceTankCapacity(int priceTankCapacity) {
        this.priceTankCapacity = priceTankCapacity;
    }
}