public class Wordbank {
    String word;
    int length;
    String[] bank = {"apple", "bees", "banana", "supercilous", "goose", "stampede", "drum", "coffee", "pencil", "lemon", "potato", "mustard", "quagsire", "bonk", "dragon", "soda", "wagon", "textbook", "dumb", "duck", "dumber", "pokemon", "flamigo", "flamingo", "tree", "waifu", "anime", "jagodzinski", "supercalifragilisticexpialidocious", "compscipoopooclass"};
    public Wordbank(int i){
        word = bank[i];
        length = bank[i].length();
        
    }
    public String getWord(int i){
        return bank[i];    //
    }

    public String getWord(){
        return word;    
    }
}


