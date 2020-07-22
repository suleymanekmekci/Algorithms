class SelectionSort{
    public static void selectionSort(int[] array) {
        for (int x = 0; x< array.length; x++) {
            int minimum = x;

            for (int y = x ; y < array.length ; y++) {
                if (array[minimum] > array[y]) {
                    minimum = y;
                }
            }

            swapValues(x,minimum,array);
        }
    }

    public static void swapValues(int indexOne, int indexTwo, int[] array) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }
}