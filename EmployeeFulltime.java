package b5.b5;

public  class EmployeeFulltime extends Employee{

    private static final long Meal_allowance = 2000000;
    private int totalWorkingdays;
    private long dailySalary;

    @Override
    public long getMealAllowance() {
        return Meal_allowance;
    }

    @Override
    public long getSalaryRate() {
        return dailySalary;
    }

    @Override
    public long getWorkingCount() {
        return totalWorkingdays;
    }

    public EmployeeFulltime(String name,int age,String identification,int totalWorkingdays,long dailySalary){
        super(name,age,identification);
        this.totalWorkingdays=totalWorkingdays;
        this.dailySalary=dailySalary;
    }

    /*public static void main(String[] args){
        EmployeeFulltime e = new EmployeeFulltime("kien",21,"0332000",30,100);
        System.out.println("salary = "+e.calculateSalary());
    }*/

    @Override
    public String toString() {
        return String.format("\tname: %s, tuoi: %d , ID: %s , totalworkingdays: %d, daylisalary: %d",
                getName(),getAge(),getIdemtification(),this.totalWorkingdays,this.dailySalary);
    }
}
