package Basics.Question;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input currency in rupees and output in USD.
        System.out.println("Enter amount in rupees:");
        long r = sc.nextLong();

        float conversionRate = 84.3f;
        float usdAmount = r / conversionRate;

        // Format to 2 decimal places
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println(df.format(usdAmount) + " USD");

        sc.close();
    }
}