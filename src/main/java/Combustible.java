public class Combustible {

    private String typeCombustible;
    private int priceCombustible;

    public Combustible(String typeCombustible, int priceCombustible) {
        this.typeCombustible = typeCombustible;
        this.priceCombustible = priceCombustible;
    }

    public String getTypeCombustible() {
        return typeCombustible;
    }

    public void setTypeCombustible(String typeCombustible) {
        this.typeCombustible = typeCombustible;
    }

    public int getPriceCombustible() {
        return priceCombustible;
    }

    public void setPriceCombustible(int priceCombustible) {
        this.priceCombustible = priceCombustible;
    }
}