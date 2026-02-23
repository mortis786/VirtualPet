public class Medicine
{
   
    private String name="";
    private boolean effect;
    
    public Medicine(String n, boolean eff){
        name=n;
        effect=eff;
        
    }
    public String getName(){
        return name;
    }
    public boolean getEffect(){
        return effect;
    }
    public void medicine(VirtualPet5 vp){
        vp.setSick(effect);
    }

    
}