package de.java.clip11_1;

public class CalculationTest {
    static class Calculation {
        static int add(int x, int y) {
            return x + y;
        }

        int substract(int x, int y) {
            return x - y;
        }
    }

    public static void main(String[] args) {
        Calculation cal = new Calculation();
        System.out.println(cal.add(100, 10));
        System.out.println(cal.substract(100,20));
        System.out.println(Calculation.add(100,20));
    }

}
