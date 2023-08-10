package Quiz_Application;

import java.util.ArrayList;
import java.util.Scanner;


public class Quiz_Application {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Username : ");
        String username = in.next();
        System.out.print("Enter Your Password : ");
        String password = in.next();

        int count = 0;

        ArrayList<Questions> questions = new ArrayList<>();

        new Data(questions);


        for (int i = 0; i < 10; i++) {
            questions.get(i).display();
            String c = in.next();
            if(c.equals(questions.get(i).ans)) {
                count++;
                System.out.println("Right Answer !!!!!");
            }
            else {
                System.out.println("Oops! You Need to focus more, Correct ans is " + questions.get(i).ans);
            }
        }

        System.out.println("Your Score Comes Out to be : " + count);
    }





}
