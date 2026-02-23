public class VirtualPet5
{
    // Instance Variables
    private int energy, happiness, weight, ageInYears, months, b,c;
    private String name;
    private boolean sick;
    private boolean dirt;
    private boolean clean;
    
    // Final Variables
    private static final int MINIMUM_WEIGHT = 5;
    private static final int MAXIMUM_LEVEL = 10;
    
    // Constructor
    public VirtualPet5(String petName)
    {
        name = petName;
        energy = 0;
        happiness = 0;
        weight = MINIMUM_WEIGHT;
        months = 0;
        ageInYears = 0; 
        sick=false;
        dirt=false;
        
    }

    
    // Accessor method   
    public String getName()
    {
        return name;
    }
    
    public int getHappinessLevel()
    {
      return happiness;
    }
    
    public int getEnergyLevel()
    {
      return energy;
    }
     public boolean getSick()
    {
      return sick;
    }
    public void setSick(boolean effect){
        sick=effect;
    }
    public void randomSick(){
        c=(int)((Math.random()*10)+1);
        if (c==9){
            sick=true;
        }
    }
    
    public void randomDirty(){
            b=(int)((Math.random()*20)+1);
            if(b==13){
                dirt=true;
            }
        }
    
    
    // feed increases the weight and
    // the hunger level, if it's not already at the maximum level, based on
    // Food food
    public void feed()
    {
        if (energy != MAXIMUM_LEVEL)
        {
            energy++;
        }
        weight++;
    }
    
    public void feed(Food food)
    {
        energy += food.getEnergyRating();
        if (energy > MAXIMUM_LEVEL)
        {
          energy = MAXIMUM_LEVEL;
        }

        happiness += food.getHappinessRating();
        if (happiness > MAXIMUM_LEVEL)
        {
          happiness = MAXIMUM_LEVEL;
        }
        if (happiness < 0)
        {
          happiness = 0;
        }

        weight += food.getWeightGain();
    }
    public void play(){
        // which increases the happiness level of the pet by 1 and decreases
        //the weight of the pet by 1. The happiness level must always be in the
        //range of 0–10, inclusive, and the weight of the pet must not fall
        //below the minimum value of 5.
        happiness+=1;
        weight-=1;
        if (weight<5){
            weight=5;
        }

    }
    
    // play increases or decreases the happiness level based on Game g
    // always staying in a valid range of 0-10
    // play will always decrease the weight based on Game g
    public boolean play(Game g)
    {
        boolean hasWon = g.isWinner();
        if (hasWon)
        {
          happiness += g.getHappinessRating();
          if (happiness > MAXIMUM_LEVEL)
          {
            happiness = MAXIMUM_LEVEL;
          }
        }
        else
        {
          happiness -= g.getHappinessRating();
            if (happiness < 0)
            {
              happiness = 0;
            }
        }

        weight -= g.getWeightLoss();
        if (weight < MINIMUM_WEIGHT)
        {
            weight = MINIMUM_WEIGHT;
        }

        return hasWon;
    }
    public void med(Medicine m){
        this.sick=m.getEffect();
        
    }
    public void clean(){
        dirt=false;
    }
    // updateStatus gets called by VirtualPetRunner2 every minute
    // This method should update the hunger, happiness, and age
    public void updateStatus()
    {
        // Changes levels if they are not currently 0
        if (energy != 0)
        {
           energy--;
        }
        if (happiness != 0)
        {
           happiness --;
        }
        
        // Increments months 
        months++;
        
        // Increments age if months is 12 and resets months to 0
        if (months == 12)
        {
            ageInYears++;
            months = 0;
        }
    }
    
    // returns a String of the state of the object
    public String toString()
    {
        String x=name + "'s Information:\nEnergy: " + energy + "\nHappiness: " 
                    + happiness + "\nWeight: " + weight + " g\nAge: " 
                    + months + " months and " + ageInYears + " years\nSick: "+sick+"\nDirty: "+ dirt; 
        if (dirt==true){
            x+="\nPlease wash "+ name+"!";
            if (sick=true){
                x+="\nPlease medicate "+ name+ "!";
            }
            else if (sick=false){
                x+="\nPlease medicate "+ name+ "!";
            }
        }
        return x;
    }
}