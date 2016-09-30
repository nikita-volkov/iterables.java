package com.github.nikita_volkov.java.iterables;

import com.github.nikita_volkov.java.iterators.AppendingIterator;

import java.util.Iterator;

public final class AppendingIterable<a> implements Iterable<a> {

  private final Iterable<a> iterable1;
  private final Iterable<a> iterable2;

  public AppendingIterable(Iterable<a> iterable1, Iterable<a> iterable2) {
    this.iterable1 = iterable1;
    this.iterable2 = iterable2;
  }

  @Override
  public Iterator<a> iterator() {
    return new AppendingIterator<a>(iterable1.iterator(), iterable2.iterator());
  }

}
