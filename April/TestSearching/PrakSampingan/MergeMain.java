package April.TestSearching.PrakSampingan;

public class MergeMain {
   
        public static void main(String[] args) {
            int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
            System.out.println("Sorting dengan merge sort");
            MergeSorting mSort = new MergeSorting();
            System.out.println("Data awal:");
            mSort.printArray(data);
            mSort.mergesort(data);
            System.out.println("Setelah diurutkan:");
            mSort.printArray(data);
        }
    }
    

