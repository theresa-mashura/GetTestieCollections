package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestArrayList {

    // ArrayList implements List Interface

    @Test
    public void testLastIndexOf() {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("Computer");
        lst.add("Mouse");
        lst.add("Monitor");
        lst.add("Headphones");
        lst.add("Monitor");

        int actual = lst.lastIndexOf("Monitor");

        Assert.assertEquals(4, actual);
    }

    @Test
    public void testRemoveIf() {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("Computer");
        lst.add("Mouse");
        lst.add("Monitor");
        lst.add("Headphones");
        lst.add("Monitor");

        lst.removeIf(n-> (n.charAt(0) == 'M'));
        boolean actual = lst.contains("Monitor");

        Assert.assertFalse(actual);
    }
}
