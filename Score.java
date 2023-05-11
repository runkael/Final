public class Score extends Wordbank {
    int score; 
    int length;

    public Score(int i){
        super(i);
        length = super.length;
    }

    //points earned per word depend on word length 
    public int points(){
        if(length <= 4){
            return 100;
        }
        else if(length <= 6){
            return 200;
        }
        else{
            return 300;
        }
    }
    
}
