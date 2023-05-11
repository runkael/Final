import java.util.Random;
import java.util.Scanner;

public class WordScramble {
    public static String scramble(String word){
        
        if(word.length() <= 3){ //base case: if word is 2 chars or less, return word bc theres nothing to scramble (none are)
            return word;
        }

        char[] chars = word.toCharArray();

        Random rand = new Random();
        for(int i = 0; i < word.length() - 1; i++){
            int j = rand.nextInt(word.length() - 3) + 3;
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        return new String(chars);

    }

    public void factory(){
        
        System.out.println("Welcome to the scramble factory! Type any word, and we will scramble it (Must be longer than 3 letters).");
        Scanner scan = new Scanner(System.in);
        while(true){

        String word = scan.nextLine();
        String scramble = scramble(word);
        System.out.println("Original word: " + word);
        System.out.println("Scrambled word: " + scramble);

        }
        
        
        
        
        
    }
    
    

    
}
