public class SelectionSort {


//    private int arr[];
//
//
//    public SelectionSort(int[] arr) {
//        this.arr = arr;
//    }

    public static int[] getSortedList(int arr[]) {

        try {
            int lengthOfArray = arr.length;
            for (int i = 0; i <= lengthOfArray - 1; i++) {
                int minimunIndex = i;

                System.out.println("I  "+i+" element "+arr[i]);
                System.out.println();

                for (int j = i + 1; j < lengthOfArray; j++) {
                    System.out.println("J is "+j+" element is  "+arr[j]);

                    if (arr[j] < arr[i]) {
                        minimunIndex = j;
                    }
                    System.out.println();

                    System.out.println("arr[minimunIndex] "+arr[minimunIndex] );
                    System.out.println("arr[i] "+arr[i] );

                    System.out.println();
                    int temp = arr[minimunIndex];
                    arr[minimunIndex] = arr[i];
                    arr[i] = temp;
                }

            }
            System.out.println(arr.length);
            for (int anArr : arr) {
                System.out.println(anArr);
            }

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return arr;
    }

}
