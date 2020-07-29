package javacore.buoi05;

public class ParttimeEmployee extends Employee {
    private static final long MEAL_ALLOWANCE = 0;
    private int totalWorkingShift;
    private long baseSalary;

    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public long getSalaryRate() {
        return baseSalary;
    }

    @Override
    public int getWorkingCount() {
        return totalWorkingShift;
    }

    public ParttimeEmployee(String name, int age, String cmnd, int totalWorkingShift, long baseSalary) {
        super(name, age, cmnd);
        this.totalWorkingShift = totalWorkingShift;
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return ("\tTen nhan vien: "+getName()+","+"So tuoi: "+getAge()+","+"So CMND:"+getCmnd()+
                ","+"So ca lam: "+getWorkingCount()+","+"luong theo ca:"+getSalaryRate());
    }
}
