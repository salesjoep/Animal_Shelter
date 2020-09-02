import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Reservation {
    public List<Animal> Animals;
    public List<Animal> getAnimals(){return Animals;}
    private void setAnimals(List<Animal> value){Animals = value;}

    public void NewCat(String name, Gender gender, String badHabits){
        this.Animals.add(new Cat(name, gender, badHabits));
    }

    public void NewDog(String name, Gender gender){
        this.Animals.add(new Dog(name, gender));
    }

}
