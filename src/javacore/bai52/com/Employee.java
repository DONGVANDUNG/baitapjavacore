package javacore.bai52.com;

public abstract class Employee {
    private String name;
    private int age;
    private String cmnd;
    public Employee() {
    }

    public Employee(String name, int age, String cmnd) {
        this.name = name;
        this.age = age;
        this.cmnd = cmnd;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getCmnd(){
        return cmnd;
    }
    public void setCmnd(){
        this.cmnd=cmnd;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age=age;

    }
public abstract long getMealAllowance();
    public abstract long  getSalaryRate();
    public abstract int getWorkingCount();
    public  long calculateSalary(){
        long salary=getMealAllowance()+getWorkingCount()*getSalaryRate();
        return salary;
}
}
