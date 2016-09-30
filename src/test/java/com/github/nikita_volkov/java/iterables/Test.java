package com.github.nikita_volkov.java.iterables;

import junit.framework.TestCase;

import java.util.*;

public class Test extends TestCase {

  public void testAppendingIterable() {
    List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
    List<Integer> list2 = Arrays.asList(5, 6, 7, 8);
    Iterable<Integer> iterable =
      new AppendingIterable<>(list1, list2);

    assertEquals(36, sum(iterable));
  }

  public void testMappingIterable() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4);
    Iterable<Integer> iterable =
      new MappingIterable<>(
        list,
        n -> n * 2
      );

    assertEquals(20, sum(iterable));
  }

  public void testFilteringIterable() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4);
    Iterable<Integer> iterable =
      new FilteringIterable<>(
        list,
        n -> n % 2 == 0
      );

    assertEquals(6, sum(iterable));
  }

  public void testUniquifyingIterable() {
    List<Integer> list = Arrays.asList(1, 2, 2, 3, 4);
    Iterable<Integer> iterable =
      new UniquifyingIterable<>(list);

    assertEquals(10, sum(iterable));
  }

  private static int sum(Iterable<Integer> iterable) {
    int sum = 0;
    for (Integer i : iterable) {
      sum += i;
    }
    return sum;
  }

}