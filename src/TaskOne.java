import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Нечётные номера по возрастанию:");
        for (int i = 0; i < n; i += 2) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.println("Чётные номера по убыванию:");
        int lastEvenIndex = (n / 2) * 2 - 1;
        for (int i = lastEvenIndex; i >= 1; i -= 2) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}