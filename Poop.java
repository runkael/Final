import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;
//import javax.swing.Timer;
import java.util.Timer;
import java.util.TimerTask;



public class Poop {

    
  
        private List<String> words = new ArrayList<>();
        private Random random = new Random();
        private int score = 0;
        public void timer(){
        TimerTask task = new TimerTask(){
            public void run(){
                System.out.println("Time is up");
                end();
            }
        };
        Timer countdown = new Timer();
        countdown.schedule(task, 60000);
    }
    public Poop(){

    }
    public void end(){
        System.out.println("Score: " + score);
        System.exit(0);
    }
    

        private String scrambleWord(String word) {
            char[] characters = word.toCharArray();
            for (int i = 0; i < characters.length; i++) {
                int randomIndex = random.nextInt(characters.length);
                char temp = characters[i];
                characters[i] = characters[randomIndex];
                characters[randomIndex] = temp;
            }
            return new String(characters);
        }


        public void playGame() {
            // add some words to the list


            System.out.println("Welcome to word scramble. Choose mode: (game/scrambler)");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            

        if(input.equals("game")){

            System.out.println("You have 60 seconds to guess as many words as you can. Start!");

            words.add("banana");
            words.add("silly");
            words.add("pear");
            words.add("scramble");
    
            boolean playAgain = true;
            Scanner scanner = new Scanner(System.in);
            while (playAgain) {
                // choose a random word from the list
                int random = (int)(Math.random()*31);
                Wordbank piggy = new Wordbank(random);
                Score bank = new Score(random);

                String originalWord = piggy.getWord();
    
                // scramble the letters of the word
                String scrambledWord = scrambleWord(originalWord);
    
                // display the scrambled word
                System.out.println("Scrambled word: " + scrambledWord);
    
                // allow the user to input their guess
                System.out.println("Guess the original word: ");
                String userGuess = scanner.nextLine();
                timer();
                // compare the user's guess to the original word
                if (userGuess.equals(originalWord)) {
                    System.out.println("Correct!");
                    score = score + bank.points();
                    

                } else {
                    System.out.println("Sorry, your guess was incorrect. The original word was " + originalWord);
                }

                
    
                // ask the user if they want to play again
              //  System.out.println("Do you want to play again? (y/n): ");
              //  String playAgainAnswer = scanner.nextLine();
               // playAgain = playAgainAnswer.equalsIgnoreCase("y");
            }
           
        }
    
        else if(input.equals("scrambler")){

           
            WordScramble eggs = new WordScramble();
            eggs.factory();

        }

        else{
            System.out.println("That was not a recognized command.");
        }



    }

            
            
    
}


