
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Emploee[] emploees = {
            new HourlyEmploee("Vadim", 27),
            new HourlyEmploee("Sergey", 20),
            new HourlyEmploee("Viktoria", 31),
            new HourlyEmploee("Fedor", 19),
            new FixedEmploee("Boris", 65),
            new FixedEmploee("Elena", 34),
            new FixedEmploee("Ekaterina", 29),
            
        };
        System.out.println(emploees.length);
        System.out.println(emploees[0].Salary(100.0));

        TreeSet<Emploee> emploeesArrayList = new TreeSet<Emploee>();

        for(int i = 0; i < emploees.length;i++){
            emploeesArrayList.add(emploees[i]);
        }
        
        for (Emploee empl: emploeesArrayList) {
            System.out.println(empl);
        }
        System.out.println();

        for (Emploee emp : emploees) {
            System.out.println(emp);
            
        }
    }
    
}
