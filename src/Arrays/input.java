package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Array is collection of data types
//        int [] arr=new int[4];
//        arr[0]=2;
//        arr[1]=1;
//        arr[2]=4;
//        arr[3]=12;
//        System.out.println(arr[2]);

//        int [] arr = new int[5];
//
//        for (int i =0;i< arr.length;i++){
//            arr[i] =in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));
//        for (int i =0;i< arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }

//        for(int num : arr){
//            System.out.print (num + " ");
//        }

        //Array of objects

        String [] str = new String[3];
        for (int i = 0;i< str.length;i++){
            str[i] =in.next();
        }

        System.out.println(Arrays.toString(str));

    }
}
