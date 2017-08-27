// Application stores 12 integers in an array.
// the integers are displayed from first to last and then displayed from last to first
public class TwelveInts {
    public static void main(String args[]){
        int x = 0, y;
        int[] array = {1,2,3,4,5,6,7,8,9,10,11};

        System.out.println("The numbers from first to last are: ");
        for(x = 0; x < array.length; x++){
            System.out.println(array[x]);
        }
        System.out.println("\n");
        System.out.println("The numbers from last to first are: ");
        for(y = x-1; y >=0; y--){
            System.out.println(array[y]);
        }
    }
}
