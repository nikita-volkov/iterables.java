package com.github.nikita_volkov.java.iterables;

import com.github.nikita_volkov.java.iterators.UniquifyingIterator;

import java.util.Iterator;

public final class UniquifyingIterable<a> implements Iterable<a> {

  private final Iterable<a> initialIterable;

  public UniquifyingIterable(Iterable<a> initialIterable) {
    this.initialIterable = initialIterable;
  }

  @Override
  public Iterator<a> iterator() {
    return new UniquifyingIterator<>(initialIterable.iterator());
  }

}
