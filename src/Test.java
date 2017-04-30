public class Test {

    public static void main(String[] args) {
        int[] arr = {53, 9, 5, 45, 6};
        System.out.println("Before Sorting");
        printSortedArray(arr);

        SelectionSort selectionSort = new SelectionSort(arr);
        System.out.println("After Sorting");
        printSortedArray(selectionSort.getSortedList());

    }

    private static void printSortedArray(int[] result) {
        for (int Arr : result) {
            System.out.println(Arr);

        }
    }

}
