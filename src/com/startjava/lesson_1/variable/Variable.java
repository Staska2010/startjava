package com.startjava.lesson_1.variable;

public class Variable {
    public static void main(String[] args) {
        byte system = 64;
        short seriesId = 2940;
        int productGroup = 958;
        long productKey = 2615000000L;
        float frequency = 1.83f;
        double ramValue = 3.89d;
        char processorSeries = 'N';
        boolean isWindows = true;

        System.out.println("System: " + system + "x");
        System.out.println("Product ID: " + productGroup + " " + productKey);
        System.out.println("Processor: " + processorSeries + seriesId);
        System.out.println("Frequency: " + frequency);
        System.out.println("RAM: " + ramValue);
        System.out.println("OS Windows? " + isWindows);
    }
}
