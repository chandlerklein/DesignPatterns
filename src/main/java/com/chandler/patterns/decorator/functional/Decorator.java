package com.chandler.patterns.decorator.functional;

import java.awt.Color;
import java.util.function.Function;
import java.util.stream.Stream;

class Camera {
    private final Function<Color, Color> filter;

    @SafeVarargs
    public Camera(Function<Color, Color>... filters) {
        this.filter = Stream.of(filters)
                            .reduce(Function.identity(), Function::andThen);
    }

    public Color snap(Color color) {
        return this.filter.apply(color);
    }

}

class Decorator {

    public static void print(Camera camera) {
        System.out.println(camera.snap(new Color(125, 125, 125)));
    }

    public static void main(String[] args) {
        print(new Camera(Color::brighter, Color::darker));
    }
}