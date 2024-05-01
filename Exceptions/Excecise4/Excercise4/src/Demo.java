class Demo {

    public static int sum(int[] array, int fromIndex, int toIndex) {
        // TODO: Delete line below and write your own solution.
        if (array == null){
            throw new IllegalArgumentException("Array is null");
        }
        if (fromIndex > toIndex){
            throw new IllegalArgumentException("fromIndex > toIndex: " + fromIndex + " > " + toIndex);
        }
        if (fromIndex < 0){
            throw new ArrayIndexOutOfBoundsException("fromIndex < 0: " + fromIndex);
        }
        if (toIndex >= array.length){
            throw new ArrayIndexOutOfBoundsException("toIndex >= array.length: " + toIndex);
        }
        int sumOfElementsInRange = 0;
        for (int i = fromIndex; i <= toIndex; i++){
            sumOfElementsInRange += array[i];
        }
        return sumOfElementsInRange;
    }
}