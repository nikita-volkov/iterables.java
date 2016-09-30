package com.github.nikita_volkov.java.iterables;

import com.github.nikita_volkov.java.iterators.MappingIterator;

import java.util.Iterator;
import java.util.function.Function;

public final class MappingIterable<a, b> implements Iterable<b> {

  private final Iterable<a> initialIterable;
  private final Function<a, b> projection;

  public MappingIterable(Iterable<a> initialIterable, Function<a, b> projection) {
    this.initialIterable = initialIterable;
    this.projection = projection;
  }

  @Override
  public Iterator<b> iterator() {
    return new MappingIterator<>(initialIterable.iterator(), projection);
  }

}
