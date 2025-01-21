package Conditions_and_Loops;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Syntax of LOOPs:
             for( initialisation ; conditions ; increament/decreament){
             //body
             }
         */

//        for (int i=1;i<6;i+=1){
//            System.out.println(i);
//        }


//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            System.out.println(i);
//        }

        //While

        /*
        Syntax while :
        while (condition){
            //body
         */

        int num=1;
        while(num<=5){
            System.out.println(num);
            num++;
        }

        //Do while

        /*
        Syntax
                do {
                     //body
                   }
                while(condition);

         */
        int n =1;
        do {
            System.out.println("Hello");
        }
        while (n!=1);
    }
}
