package ly.generalassemb.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LabTest {

    // Method 1: maxOfTwoNumbers

    @Test
    void maxOfTwoNumbers_returnsLarger() {
        assertEquals(5, Lab.maxOfTwoNumbers(5, 3));
    }

    @Test
    void maxOfTwoNumbers_handlesEqualValues() {
        assertEquals(4, Lab.maxOfTwoNumbers(4, 4));
    }

    // Method 2: maxOfThree

    @Test
    void maxOfThree_returnsLargest() {
        assertEquals(9, Lab.maxOfThree(3, 9, 5));
    }

    @Test
    void maxOfThree_handlesAllEqualValues() {
        assertEquals(7, Lab.maxOfThree(7, 7, 7));
    }

    // Method 3: isCharacterAVowel

    @Test
    void isCharacterAVowel_lowercaseVowelReturnsTrue() {
        assertTrue(Lab.isCharacterAVowel("e"));
    }

    @Test
    void isCharacterAVowel_uppercaseVowelReturnsTrue() {
        assertTrue(Lab.isCharacterAVowel("U"));
    }

    @Test
    void isCharacterAVowel_consonantReturnsFalse() {
        assertFalse(Lab.isCharacterAVowel("b"));
    }

    // Method 4: countArguments

    @Test
    void countArguments_countsMultipleArgs() {
        assertEquals(3, Lab.countArguments("a", "b", "c"));
    }

    @Test
    void countArguments_handlesZeroArgs() {
        assertEquals(0, Lab.countArguments());
    }

    // Method 5: reverseString

    @Test
    void reverseString_reversesTypicalInput() {
        assertEquals("ratset gaj", Lab.reverseString("jag testar"));
    }

    @Test
    void reverseString_handlesEmptyString() {
        assertEquals("", Lab.reverseString(""));
    }

    // Method 6: findLongestWord

    @Test
    void findLongestWord_findsLongestLength() {
        String[] words = {"cat", "elephant", "dog"};
        assertEquals(8, Lab.findLongestWord(words));
    }

    @Test
    void findLongestWord_handlesEmptyArray() {
        assertEquals(0, Lab.findLongestWord(new String[]{}));
    }

    // Method 7: filterLongWords

    @Test
    void filterLongWords_returnsWordsAboveThreshold() {
        String[] words = {"cat", "elephant", "dog", "hippopotamus"};
        String[] expected = {"elephant", "hippopotamus"};
        assertArrayEquals(expected, Lab.filterLongWords(words, 3));
    }

    @Test
    void filterLongWords_returnsEmptyArrayWhenNoneQualify() {
        String[] words = {"cat", "dog"};
        assertArrayEquals(new String[]{}, Lab.filterLongWords(words, 10));
    }
}