package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class TestVector {

    // Vector implements List Interface

    @Test
    public void testSetElementAt() {
        Vector<String> vec = new Vector<String>();
        vec.add("Apple");
        vec.add("Banana");
        vec.add("Pear");
        vec.add("Peach");

        vec.setElementAt("Apricot", 3);
        String actual = vec.get(3);

        Assert.assertEquals("Apricot", actual);
    }

    @Test
    public void testLastElement() {
        Vector<String> vec = new Vector<String>();
        vec.add("Apple");
        vec.add("Banana");
        vec.add("Pear");
        vec.add("Peach");

        String actual = vec.lastElement();

        Assert.assertEquals("Peach", actual);
    }

    @Test
    public void testContains() {
        Vector<String> vec = new Vector<String>();
        vec.add("Apple");
        vec.add("Banana");
        vec.add("Pear");
        vec.add("Peach");

        boolean actual = vec.contains("Banana");

        Assert.assertTrue(actual);
    }
}
