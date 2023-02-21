package unitTests;

import junit.framework.TestCase;

public class TestSimple extends TestCase {
    public TestSimple(String name) {
        super(name);
    }

    public void testAdd() {
        assertEquals(2, 1 + 1);
        assertEquals(4, 2+2);
        assertEquals(-8, -12+4);
    }
}
