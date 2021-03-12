package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class TestHashMap {

    // HashMap implements Map
    @Test
    public void testSize() {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "Lilly");
        map.put(2, "Daffodil");
        map.put(3, "Rose");
        map.put(4, "Petunia");

        int actual = map.size();

        Assert.assertEquals(4, actual);

    }

    @Test
    public void testReplace() {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "Lilly");
        map.put(2, "Daffodil");
        map.put(3, "Rose");
        map.put(4, "Petunia");

        map.replace(3, "Orchid");
        String actual = map.get(3);

        Assert.assertEquals("Orchid", actual);

    }
}
