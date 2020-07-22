class BinarySearch{
    public static void binarySearch(int[] array,int val) {
        int count = 0;
        int lowIndex = 0,highIndex = array.length-1;

        int valIndex;

        while (true) {
            count++;
            int middleIndex = (highIndex+lowIndex) / 2;

            if (array[middleIndex] > val) {
                highIndex = middleIndex - 1;

            }
            else if (array[middleIndex] < val) {
                lowIndex = middleIndex + 1;

            }
            else {
                valIndex = middleIndex;
                break;
            }

        }

        System.out.println("Value: " + val + " is located in index: " + valIndex);
        System.out.println(count + " iteration has occurred while searching!");
    }
}