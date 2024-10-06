package core_javapackage;

import java.util.Scanner;

public class check_any_digitnumber_for_armstrong{

    public static void main(String[] args) {
        
        int num, rem, temp, ans = 0, n = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number up to five digits:");
        num = sc.nextInt();
        
        temp = num;

      
        while (temp != 0) {
            temp /= 10;
            n++;
        }

        temp = num;
        ans = 0;  

        
        if (n == 1) {
            ans = num; 
        } 
        else if (n == 2) {
            while (temp > 0) {
                rem = temp % 10;
                ans += rem * rem;
                temp /= 10;
            }
        } 
        else if (n == 3) {
            while (temp > 0) {
                rem = temp % 10;
                ans += rem * rem * rem;
                temp /= 10;
            }
        } 
        else if (n == 4) {
            while (temp > 0) {
                rem = temp % 10;
                ans += rem * rem * rem * rem;
                temp /= 10;
            }
        } 
        else if (n == 5) {
            while (temp > 0) {
                rem = temp % 10;
                ans += rem * rem * rem * rem * rem;
                temp /= 10;
            }
        }

    
        if (num == ans) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        sc.close();
    }
}

