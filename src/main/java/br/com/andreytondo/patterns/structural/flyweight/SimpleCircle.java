package br.com.andreytondo.patterns.structural.flyweight;

import java.awt.*;

public class SimpleCircle implements Circle {
    private final Color color;

    public SimpleCircle(Color color) {
        this.color = color;
    }

    @Override
    public void draw(Graphics g, int x, int y, int radius) {
        g.setColor(color);
        g.drawOval(x, y, radius, radius);
    }
}
