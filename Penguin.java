import java.time.LocalDate;
import java.util.List;

public class Penguin extends Animal implements Goable, Swimble{
    public Penguin(String name, LocalDate birthDate, List<String> vaccination, String illness, String ownerName) {
        super(name, birthDate, vaccination, illness, ownerName);
    }

    @Override
    public double run() {
        System.out.printf("%s going", type);
        return 5.0;
    }

    @Override
    public double swim() {
        System.out.printf("%s swiming", type);
        return 10.0;
    }
}