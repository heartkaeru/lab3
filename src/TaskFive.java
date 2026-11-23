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
        params[0] = scanner.nextDouble();
        while (isPositive(params[0]) == false) {
            System.out.println("Ошибка: вес должен быть больше 0");
            System.out.print("Введите вес в кг: ");
            params[0] = scanner.nextDouble();
        }

        System.out.print("Введите рост в м: ");
        params[1] = scanner.nextDouble();
        while (isPositive(params[1]) == false) {
            System.out.println("Ошибка: рост должен быть больше 0");
            System.out.print("Введите рост в м: ");
            params[1] = scanner.nextDouble();
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
        System.out.printf("Ваш ИМТ: %.2f\n", bmi);
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
            choice = scanner.nextInt();

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
