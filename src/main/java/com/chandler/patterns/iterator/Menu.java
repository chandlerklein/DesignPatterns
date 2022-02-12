package com.chandler.patterns.iterator;

import java.util.Iterator;

public interface Menu {

    Iterator<MenuItem> createIterator();
}
