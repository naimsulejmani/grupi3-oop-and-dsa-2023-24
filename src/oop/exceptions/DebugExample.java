package oop.exceptions;
//F7 - Step Into
//F8 - Step Over
// Shift+F8 - Step Out
// F9 - continue till next break point if it has
// Break Point
// Conditional Break Point (right click on break point)
public class DebugExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int shuma = add(x, y);
        countTill(shuma);
    }

    private static void countTill(int n) {
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }

    private static int add(int x, int y) {
        int shuma = x + y;
        return shuma;
    }
}
