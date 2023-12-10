package Examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExampleTest {

    @Test
    public void shouldRemoveDuplicates() {
        String[] inputArray = {"red","blue","white","red","black","blue"};
        String[] expectedArray = {"red","blue","white","black"};

        assertArrayEquals(expectedArray, ArrayExample.removeDuplicates(inputArray));
    }

    @Test
    public void testRemoveDuplicatesWithEmptyArray() {
        String[] inputArray = {};
        String[] expectedArray = {};

        assertArrayEquals(expectedArray, ArrayExample.removeDuplicates(inputArray));
    }


}