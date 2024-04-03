package br.com.andreytondo.patterns.structural.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class CircleFactory {

    private static final Map<Color, Circle> circleMap = new HashMap<>();

    public static Circle getCircle(Color color) {
        Circle circle = circleMap.get(color);

        if (circle == null) {
            circle = new SimpleCircle(color);
            circleMap.put(color, circle);
        }

        return circle;
    }
}
