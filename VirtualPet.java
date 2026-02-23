public class VirtualPet
{
    // Instance Variables
    private int energy, happiness, weight, ageInYears, months;
    private String name;

    // Constant Variables
    private static final int MINIMUM_WEIGHT = 5;
    private static final int MAXIMUM_LEVEL = 10;

    // Constructor
    public VirtualPet(String petName)
    {
        name = petName;
        energy = 0;
        happiness = 0;
        weight = MINIMUM_WEIGHT;
        months = 0;
        ageInYears = 0;
    }

    // Accessor Methods
    public String getName()
    {
        return name;
    }

    public int getEnergyLevel()
    {
        return energy;
    }

    public int getHappinessLevel()
    {
        return happiness;
    }
    public int getAgeInYears(){
        return ageInYears;
    }
    public int getMonths(){
        return months;
    }


    public void feed(Food f)
    {
       energy+=f.getEnergyRating();
       happiness+=f.getHappinessRating();
       weight+=f.getWeightGain();
       if (energy>MAXIMUM_LEVEL){
           energy=MAXIMUM_LEVEL;
       }
       else if (happiness>MAXIMUM_LEVEL){
           happiness=MAXIMUM_LEVEL;
       }
    }
    public void feed()
    {
        if (energy != MAXIMUM_LEVEL)
        {
            energy++;
        }
        weight++;
    }
    public void updateStatus(){
        //decreases the happiness and energy level of the pet by 1.
        //The energy and happiness levels must always be in the range of 0–10, inclusive.
        //This will also increase the pet's age by 1 month.
        //If 12 months have elapsed, then the age in years should be changed by 1
        happiness=-1;
        if (happiness < 0){
            happiness = 0;
        }
        energy=-1;
        if (energy < 0){
            energy =0;
        }
        months++;
        if (months>=12){
            ageInYears++;
            months-=12;
        }

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
    public boolean play(Game g){
        // which increases the happiness level of the pet by 1 and decreases
        //the weight of the pet by 1. The happiness level must always be in the
        //range of 0–10, inclusive, and the weight of the pet must not fall
        //below the minimum value of 5.
        weight+=g.getWeightLoss();
        if (weight<MINIMUM_WEIGHT){
            weight=MINIMUM_WEIGHT;
        }
        boolean test=g.isWinner();
        if (test){
            happiness+=g.getHappinessRating();
        }
        else happiness-=g.getHappinessRating();
        return test;
    }



    // returns a String of the state of the object
    public String toString()
    {
        return name + "'s Information:\nEnergy: " + energy + "\nHappiness: "
                + happiness + "\nWeight: " + weight + " g\nAge: "
                + months + " months and " + ageInYears + " years";
    }
}