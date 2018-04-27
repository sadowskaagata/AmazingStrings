import org.junit.Test;

import static org.junit.Assert.*;

public class AmazingStringOperationCounterTest {

    private final AmazingStringOperationCounter operationCounter = new AmazingStringOperationCounter();

    @Test
    public void shouldCountOperationsInSimpleCase() throws Exception {
        int minimumOperations = operationCounter.minimumOperations("ab");

        assertEquals(0, minimumOperations);
    }

    @Test
    public void shouldCountOperationsInSingleRepetition() throws Exception {
        int minimumOperations = operationCounter.minimumOperations("aab");

        assertEquals(1, minimumOperations);
    }
    @Test
    public void shouldCountOperationsInMultipleRepetitions() throws Exception {
        int minimumOperations = operationCounter.minimumOperations("aaabb");

        assertEquals(2, minimumOperations);
    }

    @Test
    public void shouldCountOperationsInComplexCase() throws Exception {
        int minimumOperations = operationCounter.minimumOperations("ddhgfvvhhdfsjkfsxhjfbskasfnjkaaasd");

        assertEquals(4, minimumOperations);
    }

    @Test
    public void shouldCountOperationInSingleLetterRepetitions() throws Exception {
        assertEquals(0, operationCounter.minimumOperations("a"));
        assertEquals(1, operationCounter.minimumOperations("aa"));
        assertEquals(1, operationCounter.minimumOperations("aaa"));
        assertEquals(2, operationCounter.minimumOperations("aaaa"));
        assertEquals(2, operationCounter.minimumOperations("aaaaa"));
        assertEquals(3, operationCounter.minimumOperations("aaaaaa"));
    }
}