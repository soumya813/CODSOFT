//GUESS THE NUMBER GAME
import java.util.*;

public class Task1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String play = "yes";

        System.out.println("GUESS THE NUMBER!!!");
        System.out.println("You have 5 attempts in each round."+"\nGuess the number from 1-100");

        int success=0;
        int round_count=1;

        while(play.equals("yes")){
            int i=1;
            Random n = new Random();
            int number = n.nextInt(100)+1;
            System.out.println("\nRound " + round_count);
    
        while(i<=5){

            System.out.print("Enter your guess "+ i +" : ");
            int guess = s.nextInt();

            if(guess==number){
                System.out.println("Correct...wohoo!!!\nYou won!");
                success++;
                break;
            }
            else if(guess>number){
                System.out.println("Incorrect...the number is lower");
            }
            else{
                System.out.println("Incorrect...the number is higher");
            }
            
            i=i+1;
        }

        if(i>5){
        System.out.println("You lost"+"\nThe number was "+number);
        }

        System.out.println("Do you want to play another round? (yes/no)");
        play = s.next().toLowerCase();
        round_count++;
    }

    double score=(double)success/round_count;
    System.out.println("\nYour Total Score is "+score);
}
}