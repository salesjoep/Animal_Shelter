import java.time.LocalDate;
import java.time.LocalDateTime;

public class Dog extends Animal {
    public LocalDate LastWalk;
    public LocalDate getLastWalk(){return LastWalk;}
    private void setLastWalk(LocalDate value){LastWalk = value;}

    public boolean NeedsWalk(){
        return (LocalDate.now().compareTo(this.LastWalk)>0);
    }

    public Dog(String name, Gender gender){
        super(name, gender);
        this.LastWalk = LocalDate.now();
    }

    public String ToString(){
        return super.ToString() + ", Last Walk: " + this.LastWalk.toString();
    }


}
