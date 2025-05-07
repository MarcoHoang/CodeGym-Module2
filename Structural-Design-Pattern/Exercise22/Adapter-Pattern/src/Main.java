import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numberSet = new HashSet<>();
        numberSet.add(15);
        numberSet.add(42);
        numberSet.add(3);
        numberSet.add(89);
        numberSet.add(27);

        Integer max = CollectionUtilsAdapter.findMax(numberSet);
        System.out.println("Giá trị lớn nhất là: " + max);
    }
}
