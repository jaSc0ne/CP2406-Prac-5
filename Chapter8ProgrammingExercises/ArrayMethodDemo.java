// Application stores 10 integers in an array
// then calls five methods that do the following in turn:
// 1). Display all the integers
// 2). Display all the integers in reverse
// 3). Display the sum of the integers
// 4). Display all values less than a limiting argument
// 5). Display all values greater than the calculated average value
public class ArrayMethodDemo {
    public static void main(String args[]){
        int[] array = {2,6,5,9,10,18,42,71,76,88};
        displayIntegersInOrder(array);
        displayIntegersInReverse(array);
        displaySumOfIntegers(array);
        displayValuesLessThanLimiting(15, array);
        displayValuesGreaterThanAverage(array);
    }

    public static void displayIntegersInOrder(int[] array){
        System.out.println("The numbers from first to last are: ");
        for(int x = 0; x < array.length; x++){
            System.out.println(array[x]);
        }
        System.out.println("\n");
    }

    public static void displayIntegersInReverse(int[] array){
        System.out.println("The numbers from last to first are: ");
        for(int y = array.length-1; y >=0; y--){
            System.out.println(array[y]);
        }
        System.out.println("\n");
    }

    public static void displaySumOfIntegers(int[] array){
        int tot = 0;
        for(int i = 0; i < array.length; i++){
            tot += array[i];
        }
        System.out.println("Sum is: "+tot+"\n");
    }

    public static void displayValuesLessThanLimiting(int k, int[] array){
        System.out.println("The numbers in the array that are less than "+k+" are: ");
        for(int i = 0; i < array.length; i++){
            if(array[i] < k){
                System.out.println(array[i]);
            }
        }
        System.out.println("\n");
    }
    public static void displayValuesGreaterThanAverage(int[] array){
        int average;
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        average = sum/array.length;
        System.out.println("The numbers in the array that are greater than the average, "+average+", are: ");
        for(int j = 0; j < array.length; j++){
            if(array[j] > average){
                System.out.println(array[j]);
            }
        }
        System.out.println("\n");
    }


}
