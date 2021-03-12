package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class TestArrayDeque {

    // ArrayDeque implements Deque interface
    @Test
    public void testPoll() {
        ArrayDeque<String> deq = new ArrayDeque<>();
        deq.add("Mary");
        deq.add("Tom");
        deq.add("Elinor");
        deq.add("Albert");

        String actual = deq.poll();

        Assert.assertEquals("Mary", actual);
    }

    @Test
    public void testOffer() {
        ArrayDeque<String> deq = new ArrayDeque<>();
        deq.add("Mary");
        deq.add("Tom");
        deq.add("Elinor");
        deq.add("Albert");

        deq.offer("Peter");
        boolean actual = deq.contains("Peter");

        Assert.assertTrue(actual);
    }
}
