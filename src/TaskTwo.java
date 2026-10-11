import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int[] count = new int[n + 1];
        int result = 0;

        for (int i = 0; i < n; i++) {
            int x = a[i];
            if (x < 1 || x > n || count[x] > 0) {
                result = i + 1;
                break;
            }
            count[x]++;
        }

        System.out.println("Результат: " + result);

        scanner.close();
    }
}