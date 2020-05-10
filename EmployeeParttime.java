package b5.b5;

public class EmployeeParttime extends Employee {
    private static final long Meal_allowance = 0;
    private int totalWorkingShift;
    private long baseSalary;

    @Override
    public long getMealAllowance() {
        return Meal_allowance;
    }

    @Override
    public long getSalaryRate() {
        return baseSalary;
    }

    @Override
    public long getWorkingCount() {
        return totalWorkingShift;
    }

    public EmployeeParttime(String name, int age, String identification, int totalWorkingShift, long baseSalary) {
        super(name, age, identification);
        this.totalWorkingShift = totalWorkingShift;
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString(){
        return String.format("\tname: %s, tuoi: %d, Id: %s, totalworkingshift: %d, basesalary: %d ",
                getName(),getAge(),getIdemtification(),this.totalWorkingShift,this.baseSalary);
    }

}
