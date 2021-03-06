package com.chandler.patterns.lens;

import java.util.function.BiFunction;
import java.util.function.Function;

public final class Lens<A, B> {

    private final Function<A, B> getter;
    private final BiFunction<A, B, A> setter;

    public Lens(final Function<A, B> getter, final BiFunction<A, B, A> setter) {
        this.getter = getter;
        this.setter = setter;
    }

    public static <A, B> Lens<A, B> of(Function<A, B> getter, BiFunction<A, B, A> setter) {
        return new Lens<>(getter, setter);
    }

    public B get(final A a) {
        return getter.apply(a);
    }

    public A set(final A a, final B b) {
        return setter.apply(a, b);
    }
}
