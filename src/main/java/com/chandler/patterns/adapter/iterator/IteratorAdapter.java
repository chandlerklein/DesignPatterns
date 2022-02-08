package com.chandler.patterns.adapter.iterator;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter implements Enumeration<Object> {

    private final Iterator<?> iterator;

    public IteratorAdapter(Iterator<?> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
