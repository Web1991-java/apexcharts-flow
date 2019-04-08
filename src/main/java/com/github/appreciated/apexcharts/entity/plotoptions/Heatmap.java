package com.github.appreciated.apexcharts.entity.plotoptions;

class Heatmap {
    Number radius;
    Boolean enableShades;
    Number shadeIntensity;
    Boolean distributed;
    ColorScale colorScale;

    class ColorScale {
        ColorScale.Ranges ranges;
        Boolean inverse;
        Number min;
        Number max;

        class Ranges {
            Number from;
            Number to;
            String color;
            String name;
        }
    }
}
