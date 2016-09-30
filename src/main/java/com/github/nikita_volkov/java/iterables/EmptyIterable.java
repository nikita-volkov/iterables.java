package com.github.nikita_volkov.java.iterables;

import com.github.nikita_volkov.java.iterators.EmptyIterator;

import java.util.Iterator;

public final class EmptyIterable<a> implements Iterable<a> {
  @Override
  public Iterator<a> iterator() {
    return new EmptyIterator<a>();
  }
}
