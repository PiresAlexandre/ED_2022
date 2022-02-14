package Implementation;

public class SpecifiedProduct extends Product{

    private int MAX_STOCK;

    public SpecifiedProduct(String name, int stock, int MAX_STOCK) {
        super(name, stock);
        this.MAX_STOCK = MAX_STOCK;
    }

    public int getMAX_STOCK() {
        return MAX_STOCK;
    }

    public void setMAX_STOCK(int MAX_STOCK) {
        this.MAX_STOCK = MAX_STOCK;
    }

    @Override
    public String toString() {
        return "SpecifiedProduct{" +
                "MAX_STOCK=" + MAX_STOCK +
                '}';
    }
}
