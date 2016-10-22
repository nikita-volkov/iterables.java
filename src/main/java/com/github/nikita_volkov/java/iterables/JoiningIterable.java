package com.github.nikita_volkov.java.iterables;

import com.github.nikita_volkov.java.iterators.*;

import java.util.Iterator;

public final class JoiningIterable<a> implements Iterable<a> {

  private final Iterable<Iterable<a>> initialIterable;

  public JoiningIterable(Iterable<Iterable<a>> initialIterable) {
    this.initialIterable = initialIterable;
  }

  @Override
  public Iterator<a> iterator() {
    return new JoiningIterator<>(
      new MappingIterator<>(
        initialIterable.iterator(),
        Iterable::iterator
      )
    );
  }

}
