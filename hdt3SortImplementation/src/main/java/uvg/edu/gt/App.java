package uvg.edu.gt;

import java.lang.String;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

import java.util.List;
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar el número de arreglos a generar:");
        int numArrays = scanner.nextInt();

        int choice = 0;
        while (choice != 5) {
            printMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    applyAndPrintSorting(numArrays, "Gnome Sort", new GnomeSort());
                    break;
                case 2:
                    applyAndPrintSorting(numArrays, "Merge Sort", new MergeSort());
                    break;
                case 3:
                    applyAndPrintSorting(numArrays, "Quick Sort", new QuickSort());
                    break;
                case 4:
                    applyAndPrintSorting(numArrays, "Radix Sort", new RadixSort());
                    break;
                case 5:
                    System.out.println("************ Fin de ejecución del programa. ************");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor ingrese un número entre 1 y 5.");
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nElejir un algoritmo de ordenamiento:");
        System.out.println("1. Gnome Sort");
        System.out.println("2. Merge Sort");
        System.out.println("3. Quick Sort");
        System.out.println("4. Radix Sort");
        System.out.println("5. Salir del programa");
        System.out.print("Ingrese una opción (1-5): ");
    }

    private static void applyAndPrintSorting(int numArrays, String algorithmName, ISortAlgorithm sortAlgorithm) {
        for (int i = 0; i < numArrays; i++) {
            int[] array = SortingHelper.generateRandomArray(i+1);

            System.out.println("Arreglo " + (i + 1) + " original:");
            System.out.println(Arrays.toString(array.clone()));
            System.out.println("---------------------------");

            sortAlgorithm.sort(array.clone());
            System.out.println(algorithmName + " Resultado:");
            System.out.println(Arrays.toString(array.clone()));
            System.out.println("---------------------------");
        }
    }
}