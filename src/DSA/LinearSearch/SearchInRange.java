package DSA.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
    int [] arr = {18,12,-7,21,4,12};
    int target = 4;
        System.out.println(linearSearch(arr , target ,1,5));
    }
    static int linearSearch(int [] arr, int target, int start, int end){
        if (arr.length==0){
            return -1;
        }
        //run the for loop
        for(int index = start; index <= end; index++){
            //check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
