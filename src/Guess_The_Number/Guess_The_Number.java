package Guess_The_Number;

import java.util.Scanner;

public class Guess_The_Number {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = (int) (Math.random() * 100);
        int i = 0;
        System.out.print("Write Your Guess Number : ");
        while (i < 10){
            int x  = in.nextInt();
            if(x == n) {
                System.out.print("Yes You got the number!!!");
                return;
            }
            else{
                System.out.print(x > n ? "Guess Something lower : " : "Guess Something higher : ");
            }
            i++;
        }
    }
}
