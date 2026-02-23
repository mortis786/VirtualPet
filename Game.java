public class Game
{
    /* enter code for instance variables, constructor,
       and accessor methods
    **/
    private String name="";
    private int happinessIncr=1;
    private int weightDecr=1;
    public int result;
    public Game(String name, int happinessIncr, int weightDecr){
        this.name=name;
        this.happinessIncr=happinessIncr;
        this.weightDecr=weightDecr;
    }
    public String getName(){
        return name;
    }
    public int getHappinessRating(){
        return happinessIncr;
    }
    public int getWeightLoss(){
        return weightDecr;
    }
    public boolean isWinner(){
        result=(int)((Math.random()*2)+1);
        if (result==1){
            return true;
        }
        else return false;
    }
}