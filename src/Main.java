public class Main {
    public static void main(String[] args) {
        System.out.println("Задачи 1, 2");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] fractions = {1.57, 7.654, 9.986};
        int[] fives = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < fractions.length; i++) {
            if (i != fractions.length - 1) {
                System.out.print(fractions[i] + ", ");
            } else {
                System.out.print(fractions[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < fives.length; i++) {
            if (i != fives.length - 1) {
                System.out.print(fives[i] + ", ");
            } else {
                System.out.print(fives[i]);
            }
        }
        System.out.println();//перевожу каретку вниз
        System.out.println();

        System.out.println("Задача 3");
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.println();
        for (int i = fractions.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(fractions[i] + ", ");
            } else {
                System.out.print(fractions[i]);
            }
        }
        System.out.println();
        for (int i = fives.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(fives[i] + ", ");
            } else {
                System.out.print(fives[i]);
            }
        }
        System.out.println();//перевожу каретку вниз
        System.out.println();

        System.out.println("Задача 4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = numbers[i] + 1;
            }
            if (i != numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
    }
}

