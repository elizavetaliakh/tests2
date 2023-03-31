package ru.javacore;
public class Tester {
    String name;
    String surname;
    double experienceInYears;
    String englishLevel;
    double salary;
    public String getName() {return name;}
    public void setName(String name){this.name=name;}
    public String getSurname(){return surname;}
    public void setSurname(String surname){this.surname=surname;}
    public double getExperienceInYears(){return experienceInYears;}
    public void setExperienceInYears(double exp){this.experienceInYears=exp;}
    public String getEnglishLevel(){return englishLevel;}
    public void setEnglishLevel(String englishLevel){this.englishLevel=englishLevel;}
    public double getSalary(){return salary;}
    public void setSalary(double salary){this.salary=salary;}
    public Tester(){}
    public Tester(String name, String surname, double salary){
        this();
        setName(name);
        setSalary(salary);
        setSurname(surname);
    }
    public Tester(String name, String surname, double salary, String englishLevel, double experienceInYears){
        this(name, surname, salary);
        setEnglishLevel(englishLevel);
        setExperienceInYears(experienceInYears);
    }

    public double countSalary(int workingDays){
        return salary/30*workingDays;
    }
    public double countSalary(int workingDays, int daysInMonth){
        return salary/daysInMonth*workingDays;
    }

    public void info(){
        System.out.println("Information about "+getName()+" "+getSurname()+"\nSalary: "+getSalary()+
                "\nEnglish level: "+getEnglishLevel()+"\nExperience in years: "+getExperienceInYears());
    }
    public void info(int workingDays){
        this.info();
        System.out.println("Working days in a month: "+workingDays);
    }

    public void changeSalary(int salary){
        setSalary(salary);
        System.out.println("Salary changed");
    }
    public void changeSalary(double salary){
        setSalary(salary);
        System.out.println("Salary changed");
    }

    public static String saySomething(){
        return "hello^^";
    }
}
