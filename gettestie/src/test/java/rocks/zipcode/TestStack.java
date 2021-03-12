package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    // Stack extends Vector which implements List

    @Test
    public void testSearch() {
        Stack<Integer> stk = new Stack<>();
        stk.push(21);
        stk.push(22);
        stk.push(25);
        stk.push(1);

        int actual1 = stk.search(25);
        int actual2 = stk.search(1);

        Assert.assertEquals(2, actual1);
        Assert.assertEquals(1, actual2);

    }

    @Test
    public void testPop() {
        Stack<Integer> stk = new Stack<>();
        stk.push(21);
        stk.push(22);
        stk.push(25);
        stk.push(1);

        stk.pop();
        int actual = stk.peek();

        Assert.assertEquals(25, actual);
    }
}
