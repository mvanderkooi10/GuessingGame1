import java.util.Scanner;
import java.util.Random;

public class Game {
 
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);  // for user input
    Random randItemNum = new Random();    // Random generator
    
    String item; 
    int max;
    
    System.out.println("ADMINISTRATION SETUP");      // Splash screen
    System.out.println("======================");    // for Admin
    
    System.out.print("Name of the items in the jar: ");
    item = sc.nextLine();
    
    System.out.print("Maximum number of " + item + " in the jar: ");  // Get input for max number of items to be guesses.
    max = sc.nextInt();
    int randNum = randItemNum.nextInt(max);
    
    System.out.println();
    System.out.println("PLAYER");                 // Splash screen for player
    System.out.println("=================");
    System.out.println("Your goal is to guess how many " + item + 
                       " are in the jar. Your guess should be between 1 and " + max);
    System.out.println();
    
    System.out.print("Ready? (press ENTER to start guessing)");
    sc.nextLine();
    sc.nextLine();
    System.out.println();
    
      
      int number;
      int i = 0;
      
      do{                               // logic behind the game, use i++ for counter for guesses. 
        System.out.print("Guess : ");
          i++;
            number = sc.nextInt();
             
            if(number == randNum){
                 System.out.println();
          System.out.println("Congradulations - you guessed that there are " + randNum + " " + item + " in the jar! it took you " + i++ + " guess(es) to get it right.");
        }
    } while( number != randNum);
        
  }
  
}