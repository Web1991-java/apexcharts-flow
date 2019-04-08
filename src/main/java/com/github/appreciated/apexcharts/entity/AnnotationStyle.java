package com.github.appreciated.apexcharts.entity;

class AnnotationStyle {
    String background;
    String color;
    String fontSize;
    String cssClass;
    Padding padding;

    class Padding {
        Number left;
        Number right;
        Number top;
        Number bottom;
    }
}
