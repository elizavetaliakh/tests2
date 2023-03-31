package ru.javacore;

public class App 
{
    public static void main( String[] args )
    {
        Tester t1=new Tester("Mary","Gold",338.9);
        Tester t2=new Tester("Patric","Silver",290.88,"B2",2);
        t1.changeSalary(339.9);
        t1.info(25);
        t2.info();
        System.out.println("Salary for this month for "+t2.getName()+" "+t2.getSurname()+" = "+
                t2.countSalary(22));
        System.out.println("Static method: "+Tester.saySomething());
    }
}
