import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

    public static void main(String[] args) {
        Integer[] numbers = new Integer[] { 1, 2, 1, 3, 4, 4 };

        Set<Integer> duplicates = findDuplicatesArray(numbers);
        System.out.println(duplicates);

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "2");
        map.put("D", "3");
        map.put("E", "3");

        HashMap duplicateDictionaryValues = findDuplicatesDictionary(map);
        System.out.println(duplicateDictionaryValues);
    }

    protected static Set<Integer> findDuplicatesArray(Integer[] numbers) {
        Set<Integer> allItems = new HashSet<>();
        return Arrays.stream(numbers)
            .filter(n -> !allItems.add(n))
            .collect(Collectors.toSet());
    }

    //returns which values are duplicated and it's respected key
    protected static HashMap<String, String> findDuplicatesDictionary(HashMap<String, String> map) {
        final Iterator<Entry<String, String>> iter = map.entrySet().iterator();
        final HashSet<String> valueSet = new HashSet<String>();
        HashMap<String, String> duplicates = new HashMap<String, String>();
        while (iter.hasNext()) {
            final Entry<String, String> next = iter.next();
            if (!valueSet.add(next.getValue())) {
                duplicates.put(next.getKey(), next.getValue());
            }
        }
        return duplicates;
    }
}
