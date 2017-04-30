public class Test {

    public static void main(String[] args) {
        int[] arr = {3, 9, 5, 45, 6};
//        for (int anArr : arr) {
//            System.out.println(anArr);
//        }
        SelectionSort selectionSort = new SelectionSort();
        int[] aa = selectionSort.getSortedList(arr);

//        for (int i = 0; i < aa.length; i++) {
//            System.out.println(aa[i]);
//        }

    }

}
