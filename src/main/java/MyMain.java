import java.util.ArrayList;

public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        return isSortedRec(list, 0);
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        if (list.size() < i + 1){
            return true;
        }else if(list.get(i) > list.get(i+1)){
            return false;
        }else{
            return isSortedRec(list, i+1);
        }
    }



     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {
        return hasCountCopiesRec(arr, x, count, 0, 0);
    }

    // This recursive method checks if the array contains exactly
    // count copies of the integer x
    public static boolean hasCountCopiesRec(int[] arr, int x, int count, int i) {
        if (arr.length < i){
            if (count == 0){
                return true;
            }
        }else if (arr[i] == x) {
            count--;
        }
        return hasCountCopiesRec(arr, x, count, i+1);
    }




    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        Arrays.sort(arr);
        return binarySearchRec(arr, num, 0, arr.length - 1);
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound) {     
        int avg = (lowerBound + upperBound) / 2;   
        if(lowerBound > upperBound){
            return false;
        }else if(lowerBound == upperBound){
            arr[lowerBound] == num;
        }else if(arr[avg] < num){
            binarySearchRec(arr, num, mid + 1, high);
        }else{
            return binarySearchRec(arr, num, lowerBound, upperBound)
        }

    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
