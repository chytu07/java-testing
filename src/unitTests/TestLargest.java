package unitTests;

import junit.framework.*;

public class TestLargest extends TestCase {
    public TestLargest(String name) {
        super(name);
    }

    public void testSimple() {
        assertEquals(9, Largest.largest(new int[]{7, 8, 9}));
    }

    public void testOrder() {
        assertEquals(9, Largest.largest(new int[]{9, 8, 7}));
        assertEquals(9, Largest.largest(new int[]{7, 9, 8}));
        assertEquals(9, Largest.largest(new int[]{7, 8, 9}));
    }

    public void testSimple2() {
        int[] arr = new int[3];
        arr[0] = 7;
        arr[1] = 8;
        arr[2] = 9;
        assertEquals(9, Largest.largest(arr));
    }

    public void testDups() {
        assertEquals(9, Largest.largest(new int[]{9, 7, 9, 8}));
    }

    public void testOne() {
        assertEquals(1, Largest.largest(new int[]{1}));
    }

    public void testNegative() {
        int[] negList = new int[]{-9, -8, -7};
        assertEquals(-7, Largest.largest(negList));
    }

    public void testEmpty() {
        try {
            Largest.largest(new int[]{});
            fail("Should have thrown an exception");
        } catch (RuntimeException e) {
            assertTrue(true);
        }
    }
}
