package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {

    // PriorityQueue implements Queue
    @Test
    public void testElement() {
        Queue<String> q = new PriorityQueue<>();
        q.add("Dog");
        q.add("Cat");
        q.add("Parrot");
        q.add("Goldfish");

        String actual = q.element();

        Assert.assertEquals("Cat", actual);
    }

    @Test
    public void testRemove() {
        Queue<String> q = new PriorityQueue<>();
        q.add("Dog");
        q.add("Cat");
        q.add("Parrot");
        q.add("Goldfish");

        q.remove("Cat");
        String actual = q.element();

        Assert.assertEquals("Dog", actual);
    }

}
