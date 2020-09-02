import java.time.LocalDate;

public class Reservor {
    public String Name;
    public String getName(){return Name;}
    private void setName(String value){Name = value;}

    public LocalDate ReservedAt;
    public LocalDate getReservedAt(){return ReservedAt;}
    private void setReservedAt(LocalDate value){ReservedAt = value;}

    public Reservor(String name, LocalDate reservedAt)
    {
        this.Name = name;
        this.ReservedAt = reservedAt;
    }

}
