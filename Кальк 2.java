import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите арифметическое выражение:");
        String input = scanner.nextLine();
        try {
            String result = calc(input);
            System.out.println("Результат: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        scanner.close();
    }

    public static String calc(String input) {
        String[] parts = input.split("(?=[-+*/])|(?<=[-+*/])");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Неправильный формат выражения");
        }

        int a = parseNumber(parts[0]);
        int b = parseNumber(parts[2]);
        int result;
        switch (parts[1]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("Неподдерживаемая операция: " + parts[1]);
        }

        if (a >= 1 && a <= 10 && b >= 1 && b <= 10) {
            return String.valueOf(result);
        } else {
            throw new IllegalArgumentException("Числа должны быть в диапазоне от 1 до 10");
        }
    }

    private static int parseNumber(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Неправильный формат числа: " + str);
        }
    }
}
