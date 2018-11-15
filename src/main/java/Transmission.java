public class Transmission {

    private String typeTransmission;
    private int priceTransmission;

    public Transmission(String typeTransmission, int priceTransmission) {
        this.typeTransmission = typeTransmission;
        this.priceTransmission = priceTransmission;
    }

    public String getTypeTransmission() {
        return typeTransmission;
    }

    public void setTypeTransmission(String typeTransmission) {
        this.typeTransmission = typeTransmission;
    }

    public int getPriceTransmission() {
        return priceTransmission;
    }

    public void setPriceTransmission(int priceTransmission) {
        this.priceTransmission = priceTransmission;
    }
}