package com.github.nikita_volkov.java.iterables;

import com.github.nikita_volkov.java.iterators.FilteringIterator;

import java.util.Iterator;
import java.util.function.Predicate;

public final class FilteringIterable<a> implements Iterable<a> {

  private final Iterable<a> initialIterable;
  private final Predicate<a> predicate;

  public FilteringIterable(Iterable<a> initialIterable, Predicate<a> predicate) {
    this.initialIterable = initialIterable;
    this.predicate = predicate;
  }

  @Override
  public Iterator<a> iterator() {
    return new FilteringIterator<a>(initialIterable.iterator(), predicate);
  }

}
