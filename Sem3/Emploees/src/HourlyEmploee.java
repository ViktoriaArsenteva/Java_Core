
public class HourlyEmploee extends Emploee{

    public HourlyEmploee(String name, int age) {
        super(name, age);
    }

    @Override
    Double Salary(Double rate) {
        Double salary;
        salary = 20.8 * 8 * rate;
        return salary;
    }
    
}
