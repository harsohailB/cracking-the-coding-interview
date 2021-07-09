package arraystring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _01_06_StringCompressionTest {

    private _01_06_StringCompression s = new _01_06_StringCompression();

    @Test
    public void withOneSingleChar() {
        assertEquals("a1", s.compress("a"));
    }

    @Test
    public void withTwoChars() {
        assertEquals("a2", s.compress("aa"));
    }

    @Test
    public void withThreeChars() {
        assertEquals("a3", s.compress("aaa"));
    }

    @Test
    public void withDifferentChars() {
        assertEquals("a3b1", s.compress("aaab"));
    }

    @Test
    public void withDifferentChars_RepeatingSeveralTimes() {
        assertEquals("a3b2", s.compress("aaabb"));
    }

    @Test
    public void withDifferentChars_RepeatingInMoreSeqs() {
        assertEquals("a3b2a2", s.compress("aaabbaa"));
    }

    @Test
    public void bookExample() {
        assertEquals("a2b1c5a3", s.compress("aabcccccaaa"));
    }

}