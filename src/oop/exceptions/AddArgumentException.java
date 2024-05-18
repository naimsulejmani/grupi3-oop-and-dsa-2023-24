package oop.exceptions;

public class AddArgumentException {
    public static void main(String[] args) {
        args = new String[]{"1", "two", "3", "4"};

//        addArguments1(args);
//        addArguments2(args);
        addArguments3(args);
    }

    private static void addArguments1(String[] args) {
        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.println("Sum: " + sum);
    }


    private static void addArguments2(String[] args) {
        try {
            int sum = 0;
            for (String arg : args) {
                sum += Integer.parseInt(arg);
            }
            System.out.println("Sum: " + sum);
        } catch (NumberFormatException ex) {
            System.out.println("Ke dhene nje string jo-number");
            System.out.println(ex.getMessage());
        }
    }


    private static void addArguments3(String[] args) {
        int sum = 0;
        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException ex) {
                System.out.println(arg + " nuk eshte nje number!");
            }
        }
        System.out.println("Sum: " + sum);
    }
}
