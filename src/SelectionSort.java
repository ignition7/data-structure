public class SelectionSort implements Sorting {


    private int arr[];

    SelectionSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public int[] getSortedList() {
        try {
            int lengthOfArray = arr.length;
            for (int i = 0; i <= lengthOfArray - 1; i++) {
                int minimunIndex = i;
                for (int j = i + 1; j < lengthOfArray; j++) {
                    if (arr[j] < arr[i]) {
                        minimunIndex = j;
                    }
                }
                int temp = arr[minimunIndex];
                arr[minimunIndex] = arr[i];
                arr[i] = temp;
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return arr;
    }

    String getComplexity() {
        return "Time Complexity is O(n2) ";
    }

}
