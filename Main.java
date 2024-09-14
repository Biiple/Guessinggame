import java.util.Random;
import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Random rand = new Random();
        int x = rand.nextInt(100);
        int attempt = 0;

        Scanner scan = new Scanner(System.in);
        int guess;


        do {
            System.out.println("Enter your first guess:");
            guess = scan.nextInt();
            attempt++;

            // if guess is less than x
            //if guess is more than x 
            //count how many guesses
            //if count is less than 7, you print a very good response 
            //exit condition - guess = x;
            if (x<guess) {
                System.out.println("Too high");
                
            }
            if (x>guess) {
                System.out.println("Too low");
            }
            


        } while (guess!=x);
        if (attempt<=7 ){
            System.out.println("You got an impossibly good score!");
            
        }
        if (attempt>7 && attempt<10 ){
            System.out.println("You did a good job!");
            
        }
        if (attempt>=10){
            System.out.println("Try the divide and conquer strategy next time");
        }
        System.out.print(guess);

        scan.close();
    }
}