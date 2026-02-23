public class Food
{
    /* enter code for instance variables, constructor,
       and accessor methods
    **/
    private String name="";
    private int energyIncrease=1;
    private int happinessIncrease=1;
    private int weightGain=1;
    public Food(String name, int energyIncrease, int happinessIncrease, int weightGain){
        this.name=name;
        this.energyIncrease=energyIncrease;
        this.happinessIncrease=happinessIncrease;
        this.weightGain=weightGain;
    }
    public String getName(){
        return name;
    }
    public int getEnergyRating(){
        return energyIncrease;

    }
    public int getWeightGain(){
        return weightGain;
    }
    public int getHappinessRating(){
        return happinessIncrease;
    }
}