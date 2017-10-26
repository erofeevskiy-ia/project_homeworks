package com.epam.javacore.homework.hw2.task_1;

import lombok.Getter;

import java.awt.*;


public class Pen {
    private Color color;

    public Pen(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        return color != null ? color.equals(pen.color) : pen.color == null;
    }

    @Override
    public int hashCode() {
        return color != null ? color.hashCode() : 0;
    }

    /**
     * FIXME
     * @return string-describing of currentObject. example: "Color of this pen in RGB-format is[r=12,g=12,b=12]"
     */
    @Override
    public String toString() {
        Color cur = this.color;
        return "Color of this pen in RGB-format is "
                + "[r=" + cur.getRed() + ",g="
                + cur.getGreen() + ",b=" + cur.getBlue() + "]";
    }


}
