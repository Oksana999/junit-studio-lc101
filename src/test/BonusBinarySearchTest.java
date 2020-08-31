package test;

import main.BonusBinarySearch;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author Oksana
 */
public class BonusBinarySearchTest {

   private int[] sortedNumbers;

   @Before
   public void before() throws Exception {
      int length = (int) (Math.random() * 10);
      sortedNumbers = new int[length];
      for (int i = 0; i < length; i++) {
         sortedNumbers[i] = (int) (Math.random() * 10);
      }

      Arrays.sort(sortedNumbers);
   }

   @Test
   public void testNumberNotFound() {
      int foundIndex = BonusBinarySearch.binarySearch(sortedNumbers, -1);
      assertEquals(-1, foundIndex);

      foundIndex = BonusBinarySearch.binarySearch(sortedNumbers, 15);
      assertEquals(-1, foundIndex);

      foundIndex = BonusBinarySearch.binarySearch(sortedNumbers, 10);
      assertEquals(-1, foundIndex);

      foundIndex = BonusBinarySearch.binarySearch(sortedNumbers, Integer.MAX_VALUE);
      assertEquals(-1, foundIndex);

      foundIndex = BonusBinarySearch.binarySearch(sortedNumbers, Integer.MIN_VALUE);
      assertEquals(-1, foundIndex);

      foundIndex = BonusBinarySearch.binarySearch(sortedNumbers, Integer.MAX_VALUE / 2);
      assertEquals(-1, foundIndex);

      foundIndex = BonusBinarySearch.binarySearch(sortedNumbers, Integer.MIN_VALUE / 2);
      assertEquals(-1, foundIndex);
   }

   @Test
   public void testNumberExist() {
      assertIfExist(0);
      assertIfExist(1);
      assertIfExist(2);
      assertIfExist(3);
      assertIfExist(4);
      assertIfExist(5);
      assertIfExist(6);
      assertIfExist(7);
      assertIfExist(8);
      assertIfExist(9);
   }

   private void assertIfExist(int searchKey) {
      int expectedIndex = Arrays.binarySearch(sortedNumbers, searchKey);
      if (expectedIndex < 0) {
         expectedIndex = -1;
      }
      int actualIndex = BonusBinarySearch.binarySearch(sortedNumbers, searchKey);
      assertEquals(expectedIndex, actualIndex);
   }


}
