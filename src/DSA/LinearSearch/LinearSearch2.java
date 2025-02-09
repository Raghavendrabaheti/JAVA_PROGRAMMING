package DSA.LinearSearch;

public class LinearSearch2 {
    public static void main(String[] args) {
        int [] nums = {23,21,33,54, 67 ,23,55,-3,12,-3,94};
        int target =67;
        int ans =linearSearch(nums,target);
        System.out.println(ans);
    }

    //search the target and return the element it selfs//

    static boolean linearSearch3(int [] arr, int target){
        if (arr.length==0){
            return false;
        }
        //run the for loop
        for (int element : arr) {
            //check for element at every index if it is = target
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    static int linearSearch2(int [] arr, int target){
        if (arr.length==0){
            return -1;
        }
        //run the for loop
        for (int element : arr) {
            //check for element at every index if it is = target
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
    static int linearSearch(int [] arr, int target){
        if (arr.length==0){
            return -1;
        }
        //run the for loop
        for(int index =0;index<arr.length;index++){
            //check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
