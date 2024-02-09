package uvg.edu.gt;

import java.lang.String;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

import java.util.List;
public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar el tamaño del arreglo:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Desea ingresar la lista de valores manualmente:");
        System.out.println("1. Si");
        System.out.println("2. No");
        int manualType = scanner.nextInt();
        switch (manualType) {
            case 1:
                System.out.println("Ingresar los valores del arreglo:");
                for (int i = 0; i < size; i++) {
                    array[i] = scanner.nextInt();
                }
                break;
            case 2:
                array = SortingHelper.generateRandomArray(size);
                break;
        }

        while (true) {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    applyAndPrintSorting(array.clone(), "Gnome Sort", new GnomeSort());
                    break;
                case 2:
                    applyAndPrintSorting(array.clone(), "Merge Sort", new MergeSort());
                    break;
                case 3:
                    applyAndPrintSorting(array.clone(), "Quick Sort", new QuickSort());
                    break;
                case 4:
                    applyAndPrintSorting(array.clone(), "Radix Sort", new RadixSort());
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

    private static void applyAndPrintSorting(int[] array, java.lang.String algorithmName, ISortAlgorithm gnomeSort) {
        long startTime = System.currentTimeMillis();
        gnomeSort.sort(array);
        long endTime = System.currentTimeMillis();

        System.out.println("\n" + algorithmName + " Resultado:");
        System.out.println("Arreglo ordenado: " + Arrays.toString(array));
        System.out.println("Tiempo de ejecución: " + (endTime - startTime) + " millisegundos");
    }
}