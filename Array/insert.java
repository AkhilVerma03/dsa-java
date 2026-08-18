public class insert {

    public static int insertArray(int value, int idx, int[] arr, int size) {

        if (size == arr.length) {
            System.out.println("Array is full");
            return size;
        }

        if (idx < 0 || idx > size) {
            System.out.println("Invalid Index");
            return size;
        }

        for (int i = size - 1; i >= idx; i--) {
            arr[i + 1] = arr[i];
        }

        arr[idx] = value;

        size++;

        return size;
    }

    public static void main(String[] args) {

        int[] arr = new int[10];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        int size = 4;

        size = insertArray(5, 3, arr, size);

        System.out.println("Array after insertion:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}