import java.util.Scanner;
class QuickSort {
    int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int start = low;
        int end = high;
        while (start < end) {
            while (arr[start] <= pivot && start < high) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                swap(arr, start, end);
            }
        }
        swap(arr, low, end);
        return end;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int idx = partition(arr, low, high);
            quickSort(arr, low, idx);
            quickSort(arr, idx + 1, high);
        }
    }
    void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements separated by space:");
        String[] elements = scanner.nextLine().split("\\s+");
        int[] arr = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            arr[i] = Integer.parseInt(elements[i]);
        }
        QuickSort ob = new QuickSort();
        ob.quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        ob.printArray(arr, arr.length);
        scanner.close();
    }
}