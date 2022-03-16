package org.instancio.generator;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetGenerator<E> implements ValueGenerator<SortedSet<E>> {

    @Override
    @SuppressWarnings("SortedCollectionWithNonComparableKeys")
    public SortedSet<E> generate() {
        return new TreeSet<>();
    }
}