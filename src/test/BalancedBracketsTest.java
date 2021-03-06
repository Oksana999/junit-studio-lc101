package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class BalancedBracketsTest {

   //TODO: add tests here
   @Test
   public void emptyTest() {
      assertEquals(true, true);
   }

   @Test
   public void onlyBracketsReturnsTrue() {
      assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
      assertTrue(BalancedBrackets.hasBalancedBrackets("[][][][][][][][][]"));
      assertTrue(BalancedBrackets.hasBalancedBrackets("[(]"));
   }

   @Test
   public void nestedPareBracketsReturnsTrue() {
      assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));

   }

   @Test
   public void multiplePareBracketsReturnsTrue() {
      assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode], Launch[Code], []LaunchCode, []"));

   }

   @Test
   public void noneBracketsReturnsTrue() {
      assertTrue(BalancedBrackets.hasBalancedBrackets(""));

   }

   @Test
   public void oneBracketsReturnsFalse() {
      assertFalse(BalancedBrackets.hasBalancedBrackets("["));
      assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
      assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
      assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
      assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode"));

   }

   @Test
   public void roundPareBracketsReturnsFalse() {
     assertTrue(BalancedBrackets.hasBalancedBrackets("()"));
   }

   @Test
   public void curlyPareBracketsReturnsFalse() {
      assertTrue(BalancedBrackets.hasBalancedBrackets("{}"));

   }

   @Test(expected = IllegalArgumentException.class)
   public void pareNotBracketsReturnsFalse() {

      BalancedBrackets.hasBalancedParenthesis("!!");
      fail("Input string should has a set of \"balanced\" brackets");
   }

   @Test(expected = IllegalArgumentException.class)
   public void pareLettersReturnsFalse() {

      BalancedBrackets.hasBalancedParenthesis("AA");
      fail("Input string should has a set of \"balanced\" brackets");
   }

   @Test
   public void notPareBracketsReturnsFalse() {
      try {
         BalancedBrackets.hasBalancedParenthesis("[LaunchCode, Launch]Code[, [, ][");
         fail("Exception wasn't thrown");
      } catch (IllegalArgumentException ex) {
         // expected behaviour
         assertEquals("It is not a parenthesis", ex.getMessage());
      }
   }

   @Test
   public void noBracketsReturnsFalse() {
      try {
         BalancedBrackets.hasBalancedParenthesis("LaunchCode");
         fail("Exception wasn't thrown.");
      } catch (IllegalArgumentException ex) {
         // expected behaviour
         assertEquals("It is not a parenthesis", ex.getMessage());
      }
   }

}
