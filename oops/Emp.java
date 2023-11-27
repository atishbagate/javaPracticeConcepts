package oops;

public class Emp extends Person{
    float salary;

    public Emp(int id, String name, float salary) {
        super(id, name);
        this.salary = salary;
    }

    public String EmpDetails(){
        String sb = super.id + " - " + super.name + " - " + salary;
        return sb;
    }
}
