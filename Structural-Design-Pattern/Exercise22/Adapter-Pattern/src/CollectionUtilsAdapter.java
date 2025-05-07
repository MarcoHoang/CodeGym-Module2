import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter {
    public static Integer findMax(Set<Integer> numbers) {
        List<Integer> list = new ArrayList<>(numbers);
        return Collections.max(list);
    }
}
