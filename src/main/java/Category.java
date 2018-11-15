public class Category {

    private String typeCategory;
    private int priceCategory;
    private int codCategory;

    Category (int codCategory, String typeCategory, int priceCategory) {
        this.codCategory = codCategory;
        this.typeCategory = typeCategory;
        this.priceCategory = priceCategory;
    }

    public String getTypeCategory() {
        return typeCategory;
    }

    public void setTypeCategory(String typeCategory) {
        this.typeCategory = typeCategory;
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }

    public int getCodCategory() {
        return codCategory;
    }

    public void setCodCategory(int codCategory) {
        this.codCategory = codCategory;
    }

}