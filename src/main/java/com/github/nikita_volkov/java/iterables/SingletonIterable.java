package com.github.nikita_volkov.java.iterables;

import com.github.nikita_volkov.java.iterators.SingletonIterator;

import java.util.Iterator;

public final class SingletonIterable<a> implements Iterable<a> {

  private final a a;

  public SingletonIterable(a a) {
    this.a = a;
  }

  @Override
  public Iterator<a> iterator() {
    return new SingletonIterator<>(a);
  }

}
