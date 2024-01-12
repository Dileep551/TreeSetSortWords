import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class SortWordsTreeSetTest {

    @Test
    public void testGetStringArray() {
        String text = "this is a sample text";
        String[] expectedArray = {"this", "is", "a", "sample", "text"};

        assertArrayEquals(expectedArray, SortWordsTreeSet.getStringArray(text));
    }

    @Test
    public void testGetTreeSet() {
        String text = "this is a sample text";
        Set<String> expectedSet = new TreeSet<>(Arrays.asList("this", "is", "a", "sample", "text"));

        assertEquals(expectedSet, SortWordsTreeSet.getTreeSet(text));
    }


    @Test
    public void testDuplicateWords() {
        String text = "apple orange banana apple orange";
        Set<String> expectedSet = new TreeSet<>(Arrays.asList("apple", "banana", "orange"));

        assertEquals(expectedSet, SortWordsTreeSet.getTreeSet(text));

    }
}