public class FixedEmploee extends Emploee{

    public FixedEmploee(String name, int age) {
        super(name, age);
        
    }

    @Override
    Double Salary(Double fixPay) {
        Double salary;
        salary = fixPay;
        return salary;
    }
    
}
