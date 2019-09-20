import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class FindDuplicatesTest {

    @Test
    public void testDuplicateIntegers() {
        Integer[] numbers = new Integer[] { 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 7, 7, 8, 9, 3, 6, 9, 10, 11, 12, 12, 16, 3 };

        Integer arr[] = {1, 3, 6, 7, 9, 12};
        Set<Integer> expectedSet = new HashSet<>(Arrays.asList(arr));
        Set<Integer> duplicates = FindDuplicates.findDuplicatesArray(numbers);

        assertEquals(expectedSet, duplicates);
    }

    @Test
    public void testIntegersNoDuplicates() {
        Integer[] numbers = new Integer[] { 1, 2, 3, 4, 5 };

        Set<Integer> duplicates = FindDuplicates.findDuplicatesArray(numbers);

        assertEquals(new HashSet<>(), duplicates);
    }

    @Test
    public void testDictionaryDuplicates() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "2");
        map.put("D", "3");
        map.put("E", "3");

        HashMap duplicateDictionaryValues = FindDuplicates.findDuplicatesDictionary(map);

        HashMap<String, String> expectedResult = new HashMap<String, String>();
        expectedResult.put("C", "2");
        expectedResult.put("E", "3");

        assertEquals(expectedResult, duplicateDictionaryValues);
    }

    @Test
    public void testDictionaryNoDuplicates() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");
        map.put("D", "4");
        map.put("E", "5");

        HashMap duplicateDictionaryValues = FindDuplicates.findDuplicatesDictionary(map);

        HashMap<String, String> expectedResult = new HashMap<String, String>();

        assertEquals(new HashMap(), duplicateDictionaryValues);
    }
}
