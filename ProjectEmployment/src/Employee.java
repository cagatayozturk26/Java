public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(Employee emp) {
        if ((emp.salary <= 30000) && (emp.salary > 0))
            return 0;
        return emp.salary * 0.03;
    }

    public int bonus(Employee emp) {
        if (emp.workHours - 40 > 0)
            return ((emp.workHours - 40) * 30) * 4;
        return 0;
    }

    public double raiseSalary(Employee emp) {
        if (2023 - emp.hireYear < 0)
            System.out.println("Yıl bilgisi hatalı girildi.");
        if ((2023 - emp.hireYear < 10) && (2023 - emp.hireYear > 0))
            return emp.salary * 0.05;
        if ((2023 - emp.hireYear >= 10) && (2023 - emp.hireYear < 20))
            return emp.salary * 0.1;
        return emp.salary * 0.15;
    }

    public void printInformation(Employee emp) {
        System.out.println("Adı-Soyadı: " + emp.name);
        System.out.println("Maaşı: " + emp.salary);
        System.out.println("Haftalık çalışma saati: " + emp.workHours);
        System.out.println("Vergi: " + emp.tax(emp));
        System.out.println("Bonus: " + emp.bonus(emp));
        System.out.println("Maaş artışı: " + emp.raiseSalary(emp));
        System.out.println("Vergi ve bonuslar ile maaş: " + (emp.salary + emp.bonus(emp) + emp.raiseSalary(emp) - emp.tax(emp)));

    }
}
