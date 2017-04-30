public class BubbleSort implements Sorting {

    private int[] arr;

    BubbleSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public int[] getSortedList() {
        try {
            int lengthOfArray = arr.length;
            for (int j = 0; j <= lengthOfArray - 1; j++) {
                for (int i = 0; i <= lengthOfArray - j - 1; i++) {
                    if (arr[i + 1] < arr[i]) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return arr;
    }
}
