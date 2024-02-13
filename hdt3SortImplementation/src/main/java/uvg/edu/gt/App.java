package uvg.edu.gt;

import java.lang.String;
import java.util.Scanner;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar el número de arreglos a generar:");
        int numArrays = scanner.nextInt();


        int inputProcessing = -1;
        while (inputProcessing > 1 || inputProcessing < 0) {
            System.out.println("Seleccione una opción de ejecución:");
            System.out.println("0. Arreglo ordenado");
            System.out.println("1. Arreglo no ordenado");
            inputProcessing = scanner.nextInt();
        }

        // 0 = SORTED, 1 = UNSORTED
        ProcessingType processing = ProcessingType.getTypeByOrdinal(inputProcessing);

        int choice = 0;
        while (choice != 6) {
            printMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    applyAndPrintSorting(numArrays, "Gnome Sort", new GnomeSort(), processing);
                    break;
                case 2:
                    applyAndPrintSorting(numArrays, "Merge Sort", new MergeSort(), processing);
                    break;
                case 3:
                    applyAndPrintSorting(numArrays, "Quick Sort", new QuickSort(), processing);
                    break;
                case 4:
                    applyAndPrintSorting(numArrays, "Radix Sort", new RadixSort(), processing);
                    break;
                case 5:
                    applyAndPrintSorting(numArrays, "Bubble Sort", new BubbleSort(), processing);
                    break;
                case 6:
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
        System.out.println("5. Bubble Sort");
        System.out.println("6. Salir del programa");
        System.out.print("Ingrese una opción (1-6): ");
    }

    private static void applyAndPrintSorting(int numArrays, String algorithmName, ISortAlgorithm sortAlgorithm, ProcessingType processing) {
        for (int i = 0; i < numArrays; i++) {
            int[] array = switch (processing) {
                case SORTED -> SortingHelper.generateSortedArray(i + 1);
                case UNSORTED -> SortingHelper.generateRandomArray(i + 1);
            };

            System.out.println("Arreglo original " + (i + 1) + " elementos:");
            System.out.println(Arrays.toString(array));
            System.out.println("---------------------------");

            int[] tmpArray = array;
            long startTime = System.nanoTime();
            sortAlgorithm.sort(tmpArray);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println(algorithmName + " Resultado:");
            System.out.println(Arrays.toString(tmpArray));
            System.out.println(duration);
            System.out.println("---------------------------");
        }
    }
}