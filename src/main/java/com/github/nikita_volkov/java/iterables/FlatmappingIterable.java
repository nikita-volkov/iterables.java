package com.github.nikita_volkov.java.iterables;

import com.github.nikita_volkov.java.iterators.FlatmappingIterator;

import java.util.Iterator;
import java.util.function.Function;

public final class FlatmappingIterable<a, b> implements Iterable<b> {

  private final Iterable<a> initialIterable;
  private final Function<a, Iterable<b>> projection;

  public FlatmappingIterable(Iterable<a> initialIterable, Function<a, Iterable<b>> projection) {
    this.initialIterable = initialIterable;
    this.projection = projection;
  }

  @Override
  public Iterator<b> iterator() {
    return new FlatmappingIterator<>(
      initialIterable.iterator(),
      projection.andThen(Iterable::iterator)
    );
  }

}
