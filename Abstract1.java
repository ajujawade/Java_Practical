abstract class Employee {
    protected String name;
    protected int age;
    protected String gender;

    public Employee(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public abstract double calculateSalary();
    public abstract void displayEmployeeDetails();
}

class Manager extends Employee {
    protected double baseSalary;
    protected double bonus;

    public Manager(String name, int age, String gender, double baseSalary, double bonus) {
        super(name, age, gender);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return baseSalary + bonus;
    }

    public void displayEmployeeDetails() {
        System.out.println("Manager Details:");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Base Salary : " + baseSalary);
        System.out.println("Bonus : " + bonus);
        System.out.println("Total Salary : " + calculateSalary());
    }
}

class Worker extends Employee {
    protected double hourlyRate;
    protected int hoursWorked;

    public Worker(String name, int age, String gender, double hourlyRate, int hoursWorked) {
        super(name, age, gender);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public void displayEmployeeDetails() {
        System.out.println("Worker Details:");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Hourly Rate : " + hourlyRate);
        System.out.println("Hours Worked : " + hoursWorked);
        System.out.println("Total Salary : " + calculateSalary());
    }
}

class SalesPerson extends Manager {
    protected double commissionRate;

    public SalesPerson(String name, int age, String gender, double baseSalary, double bonus, double commissionRate) {
        super(name, age, gender, baseSalary, bonus);
        this.commissionRate = commissionRate;
    }

    public double calculateSalary() {
        return super.calculateSalary() + super.baseSalary * commissionRate;
    }

    public void displayEmployeeDetails() {
        System.out.println("SalesPerson Details:");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Base Salary : " + baseSalary);
        System.out.println("Bonus : " + bonus);
        System.out.println("Total Salary : " + calculateSalary());
        System.out.println("Commission Rate : " + commissionRate);
    }
}

public class Abstract1 {
    public static void main(String[] args) {
        Employee manager = new Manager("Ajay", 21, "Male", 50000, 10000);
        Employee worker = new Worker("Tejas", 69, "Male", 20, 160);
        Employee salesPerson = new SalesPerson("Tony", 45, "Male", 6000, 1500, 0.5);

        manager.displayEmployeeDetails();
        System.out.println();
        worker.displayEmployeeDetails();
        System.out.println();
        salesPerson.displayEmployeeDetails();
    }
}
