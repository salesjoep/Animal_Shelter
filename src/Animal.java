import java.time.LocalDate;

public abstract class Animal {
    private String Name;
    public String getName(){return Name;}
    private void setName(String value){Name = value;}

    public Gender Gender;
    public Gender getGender(){return Gender;}
    private void setGender(Gender value){Gender = value;}

    public Reservor ReservedBy;
    public Reservor getReservedBy(){return ReservedBy;}
    private void setReservedBy(Reservor value){ReservedBy = value;}

    public Animal(String name, Gender gender){
        this.Name = name;
        this.Gender = gender;
    }

    public Animal(){

    }

    public boolean Reserve(String reservedBy){
        if (this.ReservedBy == null){
            this.ReservedBy = new Reservor(reservedBy, LocalDate.now());
            return true;
        }
        return false;
    }

    public String ToString(){
        String reserved = "not reserved";
        if (this.ReservedBy != null){
            reserved = "reserved by " + this.ReservedBy.Name;
        }
        return this.Name + this.Gender + reserved;
    }

}
