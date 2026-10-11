import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите M (строки): ");
        int m = scanner.nextInt();

        System.out.print("Введите N (столбцы): ");
        int n = scanner.nextInt();

        int[][] a = new int[m][n];

        // Заполнение матрицы
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = 5 * (j + 1);
            }
        }

        // Вывод матрицы
        System.out.println("Результат:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}