class InsertionSort{
    public static void insertionSort(int[] array) {

        int count = 0;

        for (int i = 1; i <array.length; i++) {
            count++;

            int j = i;

            int toInsert = array[j];

            while ((j> 0) && (array[j-1] > toInsert)) {
                array[j] = array[j - 1];
                j--;
                count++;
            }

            array[j] = toInsert;

        }

        System.out.println(count + " iteration has occurred while sorting!");
    }
}
