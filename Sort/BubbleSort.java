class BubbleSort{
    public static void bubbleSort(int[] array) {
        int count = 0;
        for (int i = array.length - 1; i > 0 ; i--) {

            for (int j = 0; j < i; j++) {
                count++;
                if (array[j] > array[j+1]) {
                    swapValues(j, j+1, array);
                }
            }
        }

        System.out.println(count + " iteration has occurred while sorting!");
    }

    public static void swapValues(int indexOne, int indexTwo, int[] array) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }
}