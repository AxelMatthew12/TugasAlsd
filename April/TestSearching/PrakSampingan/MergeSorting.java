package April.TestSearching.PrakSampingan;

public class MergeSorting {
    public void mergesort(int[] data) {
        sort(data, 0, data.length - 1);
    }

    private void merge(int data[], int left, int middle, int right) {
        int[] temp = new int[right - left + 1];
        int a = left;
        int b = middle + 1;
        int c = 0;

        while (a <= middle && b <= right) {
            if (data[a] <= data[b]) {
                temp[c++] = data[a++];
            } else {
                temp[c++] = data[b++];
            }
        }

        while (a <= middle) {
            temp[c++] = data[a++];
        }

        while (b <= right) {
            temp[c++] = data[b++];
        }

        System.arraycopy(temp, 0, data, left, temp.length);
    }

    private void sort(int data[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(data, left, middle);
            sort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

