public class Ex2_Optional {
    public static void main(String[] args) {
        int[] arr = {54, 7, 3, 5, 9, -4, -99};
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println("Array after sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(binarySearch(arr, 0, arr.length - 1, 9));

    }

    public static int binarySearch(int arr[], int left, int right, int key) {
        int mid = (left + right) / 2;
        if (right >= left) {
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return binarySearch(arr, left, mid - 1, key);
            }
            if (arr[mid] < key) {
                return binarySearch(arr, mid + 1, right, key);
            }
        }
        return -1;
    }
}
