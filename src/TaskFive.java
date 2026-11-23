import java.util.Scanner;

public class TaskFive {

    public static void printMenu() {
        System.out.println("\nМеню:");
        System.out.println("1. Выполнить расчёт ИМТ");
        System.out.println("2. Информация о программе");
        System.out.println("3. Информация о разработчике");
        System.out.println("4. Выход");
        System.out.print("Выберите пункт: ");
    }

    public static boolean isPositive(double value) {
        return value > 0;
    }

    public static double[] inputData(Scanner scanner) {
        double[] params = new double[2];

        System.out.print("Введите вес в кг: ");
        while (true) {
            if (scanner.hasNextDouble()) {
                params[0] = scanner.nextDouble();
                if (isPositive(params[0])) {
                    break;
                }
            } else {
                scanner.nextLine(); // убрать текстовый ввод
            }

            System.out.println("Ошибка: введите вес числом больше 0");
            System.out.print("Введите вес в кг: ");
        }

        System.out.print("Введите рост в м: ");
        while (true) {
            if (scanner.hasNextDouble()) {
                params[1] = scanner.nextDouble();
                if (isPositive(params[1])) {
                    break;
                }
            } else {
                scanner.nextLine(); // убрать текстовый ввод
            }

            System.out.println("Ошибка: введите рост числом больше 0");
            System.out.print("Введите рост в м: ");
        }

        return params;
    }

    public static double calculateBmi(double[] params) {
        double weight = params[0];
        double height = params[1];
        return weight / (height * height);
    }

    public static String getBmiCategory(double bmi) {
        if (bmi < 18.5) {
            return "пониженный вес";
        } else if (bmi < 25) {
            return "норма";
        } else if (bmi < 30) {
            return "избыточный вес";
        } else {
            return "ожирение";
        }
    }

    public static void printResult(double bmi) {
        System.out.printf("Ваш ИМТ: %.2f — %s\n", bmi, getBmiCategory(bmi));
    }

    public static void showProgramInfo() {
        System.out.println("\nПрограмма рассчитывает индекс массы тела (ИМТ).");
    }

    public static void showDeveloperInfo() {
        System.out.println("\nРазработчик: Михайлова Дарья");
        System.out.println("Специальность: Алгоритмы ИИ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            printMenu();
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Ошибка: введите номер пункта меню от 1 до 4.");
                scanner.nextLine(); // убрать ошибочный ввод
                continue;            // снова показать меню
            }

            switch (choice) {
                case 1:
                    double[] params = inputData(scanner);
                    double bmi = calculateBmi(params);
                    printResult(bmi);
                    break;
                case 2:
                    showProgramInfo();
                    break;
                case 3:
                    showDeveloperInfo();
                    break;
                case 4:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неверный пункт меню, попробуйте снова.");
                    break;
            }
        }

        scanner.close();
    }
}