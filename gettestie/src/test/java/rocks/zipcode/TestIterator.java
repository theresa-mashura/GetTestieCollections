package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

    // Iterator
    @Test
    public void testNext() {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("Computer");
        lst.add("Mouse");
        lst.add("Monitor");
        lst.add("Headphones");
        lst.add("Monitor");

    Iterator<String> itr = lst.iterator();
    String actual = itr.next();

    Assert.assertEquals("Computer", actual);

    actual = itr.next();
    Assert.assertEquals("Mouse", actual);

    }

    @Test
    public void testHasNext() {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("Computer");
        lst.add("Mouse");
        lst.add("Monitor");
        lst.add("Headphones");
        lst.add("Monitor");

        Iterator<String> itr = lst.iterator();
        boolean actual = itr.hasNext();

        Assert.assertTrue(actual);
    }
}
