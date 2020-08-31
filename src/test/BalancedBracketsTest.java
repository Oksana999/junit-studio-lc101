package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));

    }
    @Test
    public void nestedPareBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));

    }

    @Test
    public void multiplePareBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode], Launch[Code], []LaunchCode, , []"));

    }
    @Test
    public void noneBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));

    }

    @Test
    public void oneBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void roundPareBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("()"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void curlyPareBracketsReturnsFalse() {
        BalancedBrackets.hasBalancedBrackets("{}");
        fail("Input string should has a set of \"balanced\" brackets");
    }

    @Test(expected = IllegalArgumentException.class)
    public void pareNotBracketsReturnsFalse() {

        BalancedBrackets.hasBalancedBrackets("!!");
        fail("Input string should has a set of \"balanced\" brackets");
    }

    @Test(expected = IllegalArgumentException.class)
    public void pareLettersReturnsFalse() {

        BalancedBrackets.hasBalancedBrackets("AA");
        fail("Input string should has a set of \"balanced\" brackets");
    }


    @Test(expected = IllegalArgumentException.class)
    public void notPareBracketsReturnsFalse() {
        BalancedBrackets.hasBalancedBrackets("[LaunchCode, Launch]Code[, [, ][");

        fail("Input string should has a set of \"balanced\" brackets");
    }

    @Test(expected = IllegalArgumentException.class)
    public void noBracketsReturnsFalse() {
        BalancedBrackets.hasBalancedBrackets("LaunchCode");

        fail("Input string should has a set of \"balanced\" brackets");
    }

}
