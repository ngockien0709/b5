package b5.b5;

public abstract class Employee {

    private String name;
    private int age;
    private String idemtification;

    public Employee(String name,int age, String idemtification){
        this.name=name;
        this.age=age;
        this.idemtification=idemtification;
    }

    public Employee(){}

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getIdemtification(){
        return idemtification;
    }

    public void setIdemtification(String idemtification){
        this.idemtification=idemtification;
    }

    public abstract long getMealAllowance();

    public abstract long getSalaryRate();

    public abstract long  getWorkingCount ();

    public long calculateSalary() {
        long salary = getSalaryRate() + getMealAllowance() + getWorkingCount();
        return salary;
    }
}
