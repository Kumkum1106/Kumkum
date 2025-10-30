//class reverse array{
   // public static void main(String[] args) {
        //int[] array = {1,2,3,4,5}
        //for(int i =4; i>=0; i--){
            //System.out.println(array[i]);
    //}}

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[arr.length - 1 - i] = arr[i];
        }
        for (int num : reversed) {
            System.out.print(num + " "); // Output: 5 4 3 2 1
        }
    }
}
