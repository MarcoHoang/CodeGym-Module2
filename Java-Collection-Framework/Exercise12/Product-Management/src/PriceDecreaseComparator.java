import java.util.Comparator;

public class PriceDecreaseComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p2.getPrice(), p1.getPrice());
    }
}
