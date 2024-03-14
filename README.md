Доброго времени суток. Кратко опишу процесс выполнения. Задание выполнил несколько дней назад. Но до диплоя дошло только сейчас.
Я не стал делать аккаунт в oracle и диплоить себе IntelliJ IDEA.. Я пользовался этим: https://www.onlinegdb.com/
что по сути не отличается по функционалу от упомянутой в тестовом задании.
Ниже приведу описание каждой строки кода:
1.	import java.util.HashMap;: Эта строка импортирует класс HashMap из пакета java.util, который используется для создания карты значений (ассоциативного массива).
2.	import java.util.Map;: Эта строка импортирует интерфейс Map из пакета java.util, который представляет собой абстракцию для коллекции, которая хранит пары ключ-значение.
3.	import java.util.Scanner;: Эта строка импортирует класс Scanner из пакета java.util, который используется для считывания ввода из консоли.
javaCopy code
class Main { 
4.	class Main {: Эта строка начинает определение класса Main.
javaCopy code
public static void main(String[] args) { 
5.	public static void main(String[] args) {: Эта строка объявляет метод main, который является точкой входа в программу. Он принимает массив строк в качестве аргумента (args), который содержит аргументы командной строки.
javaCopy code
Scanner scanner = new Scanner(System.in); System.out.println("Введите арифметическое выражение:"); String input = scanner.nextLine(); 
6.	Scanner scanner = new Scanner(System.in);: Эта строка создает новый объект класса Scanner, который считывает ввод из стандартного потока ввода (System.in), то есть из консоли.
7.	System.out.println("Введите арифметическое выражение:");: Эта строка выводит приглашение для пользователя в консоль, запрашивая ввод арифметического выражения.
8.	String input = scanner.nextLine();: Эта строка считывает строку, введенную пользователем, из консоли и сохраняет ее в переменной input.
javaCopy code
try { String result = calc(input); System.out.println("Результат: " + result); } catch (IllegalArgumentException e) { System.out.println("Ошибка: " + e.getMessage()); } 
9.	try { ... } catch (IllegalArgumentException e) { ... }: Этот блок позволяет обрабатывать исключения. Внутри блока try вызывается метод calc(input) для вычисления результата арифметического выражения. Если возникает исключение типа IllegalArgumentException, то программа переходит к блоку catch, где выводится сообщение об ошибке.
javaCopy code
scanner.close(); 
10.	scanner.close();: Эта строка закрывает объект Scanner, чтобы освободить ресурсы после завершения ввода из консоли.
javaCopy code
public static String calc(String input) { 
11.	public static String calc(String input) {: Эта строка объявляет метод calc, который принимает строку input в качестве аргумента и возвращает строку (результат арифметического выражения).
javaCopy code
String[] parts = input.split("(?=[-+*/])|(?<=[-+*/])"); 
12.	String[] parts = input.split("(?=[-+*/])|(?<=[-+*/])");: Эта строка разделяет входную строку на подстроки перед и после арифметических операторов (+, -, *, /), используя регулярное выражение (?=[-+*/])|(?<=[-+*/]).
javaCopy code
if (parts.length != 3) { throw new IllegalArgumentException("Неправильный формат выражения"); } 
13.	if (parts.length != 3) { throw new IllegalArgumentException("Неправильный формат выражения"); }: Эта строка проверяет, содержит ли массив parts ровно три элемента (число, оператор, число). Если нет, выбрасывается исключение с сообщением о неправильном формате выражения.
javaCopy code
int a = parseNumber(parts[0]); int b = parseNumber(parts[2]); 
14.	int a = parseNumber(parts[0]); и int b = parseNumber(parts[2]);: Эти строки парсят первое и третье элементы массива parts в целые числа a и b с помощью метода parseNumber.
javaCopy code
int result; switch (parts[1]) { case "+": result = a + b; break; case "-": result = a - b; break; case "*": result = a * b; break; case "/": result = a / b; break; default: throw new IllegalArgumentException("Неподдерживаемая операция: " + parts[1]); } 
15.	switch (parts[1]) { ... }: Этот блок switch проверяет оператор, указанный во втором элементе массива parts, и выполняет соответствующее арифметическое действие (сложение, вычитание, умножение, деление).
javaCopy code
if (a >= 1 && a <= 10 && b >= 1 && b <= 10) { return String.valueOf(result); } else { throw new IllegalArgumentException("Числа должны быть в диапазоне от 1 до 10"); } 
16.	if (a >= 1 && a <= 10 && b >= 1 && b <= 10) { ... } else { ... }: Этот блок проверяет, находятся ли числа a и b в диапазоне от 1 до 10 включительно. Если да, возвращается строковое представление результата; в противном случае выбрасывается исключение с сообщением о неправильном диапазоне чисел.
javaCopy code
private static int parseNumber(String str) { try { return Integer.parseInt(str); } catch (NumberFormatException e) { throw new IllegalArgumentException("Неправильный формат числа: " + str); } } 
17.	private static int parseNumber(String str) { ... }: Этот метод принимает строку str и пытается преобразовать ее в целое число с помощью метода parseInt. Если преобразование не удалось, выбрасывается исключение с сообщением о неправильном формате числа.
Это объяснение каждой строки кода.

Я не сильно еще разобрался с GitHab. Но суть понятна.
