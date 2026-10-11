import java.util.Scanner;

public class TaskThree {

    public static double[] makeArrayB(int[] a) {
        int n = a.length;
        double[] b = new double[n];

        for (int k = 0; k < n; k++) {
            double sum = 0;
            int count = 0;

            for (int j = k; j < n; j++) {
                sum += a[j];
                count++;
            }

            b[k] = sum / count;
        }

        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        System.out.println("Введите элементы массива A:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        double[] b = makeArrayB(a);

        System.out.println("Массив B:");
        for (int i = 0; i < n; i++) {
            System.out.println("B[" + (i + 1) + "] = " + b[i]);
        }

        scanner.close();
    }
}