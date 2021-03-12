package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class TestLinkedList {

    // LinkedList implements List & Deque

    @Test
    public void testRemoveFirstOccurrence() {
        LinkedList<String> lst = new LinkedList<>();
        lst.add("A");
        lst.add("B");
        lst.add("B");
        lst.add("D");
        lst.add("E");

        lst.removeFirstOccurrence("A");
        boolean actual = lst.contains("A");

        lst.removeFirstOccurrence("B");
        boolean actual2 = lst.contains("B");

        Assert.assertFalse(actual);
        Assert.assertTrue(actual2);
    }

    @Test
    public void testPollLast() {
        LinkedList<String> lst = new LinkedList<>();
        lst.add("A");
        lst.add("B");
        lst.add("B");
        lst.add("D");
        lst.add("E");

        String actual = lst.pollLast();
        String actual2 = lst.pollLast();

        Assert.assertEquals("E", actual);
        Assert.assertEquals("D", actual2);

    }
}
