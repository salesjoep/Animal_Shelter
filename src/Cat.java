public class Cat extends Animal {
    public String BadHabits;
    public String getBadHabits(){return BadHabits;}
    private void setBadHabits(String value){BadHabits = value;}
    public double maxPrice = 350;
    public double minPrice = 35;
    private int badHabitsLength;


    public Cat(String name, Gender gender, String badHabits){
        super(name, gender);
        this.BadHabits = badHabits;
    }

    public String ToString(){
        return super.ToString() + ", bad habits: " + this.BadHabits.toLowerCase();
    }


}
