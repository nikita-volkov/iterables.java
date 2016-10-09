package com.github.nikita_volkov.java.iterables;

import com.github.nikita_volkov.java.iterators.ArrayIterator;

import java.util.Iterator;

public final class ArrayIterable<a> implements Iterable<a> {

  private final a[] array;

  public ArrayIterable(a[] array) {
    this.array = array;
  }

  @Override
  public Iterator<a> iterator() {
    return new ArrayIterator<>(array);
  }
}
