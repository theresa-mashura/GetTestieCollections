package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TestTreeMap {

    // TreeMap implements NavigableMap which extends SortedMap

    @Test
    public void testReplaceAll() {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(99, "Jason");
        map.put(98, "Theresa");
        map.put(77, "Justin");

        map.replaceAll((k,v) -> v + " LastName");
        String actual = map.get(99);

        Assert.assertEquals("Jason LastName", actual);

    }

    @Test
    public void testContainsValue() {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(99, "Jason");
        map.put(98, "Theresa");
        map.put(77, "Justin");

        boolean actual = map.containsValue("Theresa");

        Assert.assertTrue(actual);

    }
}
