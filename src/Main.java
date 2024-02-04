public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 9, 6, 3, 5, 8, 1};
        insertSort(arr);

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
    public static void insertSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
            }
        }
    }