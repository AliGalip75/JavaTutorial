package SalaryCalculator;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name,double salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax(){
        if(this.salary < 1000){
            return 0;
        }else{
            return this.salary*(3.0 /100);
        }
    }

    int bonus(){
        if(this.workHours > 40){
            return 30*(this.workHours - 40);
        }else{
            return 0;
        }
    }

    double raiseSalary(){
        int currentYear = 2021;
        if((currentYear - this.hireYear) < 10){
            return this.salary*(5.0/100);
        }else if((currentYear - this.hireYear) >= 9 && (currentYear - this.hireYear) < 20){
            return this.salary*(10.0/100);
        }else{
            return this.salary*(15.0/100);
        }
    }

    void toString1(){
        System.out.println("Adı:" + this.name);
        System.out.println("Maaşı:" + this.salary);
        System.out.println("Çalışma saati:" + this.workHours);
        System.out.println("Başlangıç yılı:" + this.hireYear);
        System.out.println("Vergi:" + this.tax());
        System.out.println("Bonus:" + this.bonus());
        System.out.println("Maaş artışı:" + this.raiseSalary());
        System.out.println("Vergi ve bonusla birlikte maaş:" + (this.salary + this.bonus() - this.tax()));
        System.out.println("Toplam maaş:" + (this.salary + this.bonus() + this.raiseSalary() - this.tax()));
    }

}
