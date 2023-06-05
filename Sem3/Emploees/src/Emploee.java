public abstract class Emploee implements Comparable<Emploee>{
    String name;
    int age;
    
    public Emploee(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ";" +
                " Age: " + age;
    }

    abstract Double Salary(Double data);

    @Override
    public int compareTo(Emploee anotherEmploee)
    {
        if (this.age == anotherEmploee.age) {
            return 0;
        } else if (this.age < anotherEmploee.age) {
            return -1;
        } else {
            return 1;
        }
    }
}
