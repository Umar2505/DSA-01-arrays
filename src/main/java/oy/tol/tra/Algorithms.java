package oy.tol.tra;

public final class Algorithms {

   private Algorithms() {}

   public static <T extends Comparable<T>> void sort(T [] array) {
      for (int current = 0; current < array.length - 1; current++) {
         for (int next = current + 1; next < array.length; next++) {
            if (array[current].compareTo(array[next]) > 0) {
               swap(array, current, next);
            }
         }
      }
   }

   public static <T> void reverse(T [] array) {
      for (int left = 0, right = array.length - 1; left < right; left++, right--) {
         swap(array, left, right);
      }
   }

   public static <T> void swap(T [] array, int first, int second) {
      T temporary = array[first];
      array[first] = array[second];
      array[second] = temporary;
   }
}
