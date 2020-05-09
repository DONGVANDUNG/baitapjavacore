package javacore.bai52.com;

public class FulltimeEmployee extends Employee{
    private static final long MEAL_ALLOWANCE = 2000000;
    private int  totalWorkingDays;
    private  long dailySalary;
    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public long getSalaryRate() {
        return dailySalary;
    }

    @Override
    public int getWorkingCount() {
        return totalWorkingDays;
    }

    public FulltimeEmployee(String name, int age, String cmnd, int totalWorkingDays, long dailySalary) {
        super(name, age, cmnd);
        this.totalWorkingDays = totalWorkingDays;
        this.dailySalary = dailySalary;
    }

    public static void main(String[] args) {
        FulltimeEmployee e =new FulltimeEmployee("dong van dung",18,"0302010100",34,
                1200);
        System.out.println("Salary="+e.calculateSalary());
    }

    @Override
    public String toString() {
        return ("\tTen nhan vien"+getName()+",So tuoi:"+getAge()+",So CMND:"+getCmnd()+",So ngay lam viec:"+getWorkingCount()
        +",luong theo ngay:"+getSalaryRate());
    }
}
