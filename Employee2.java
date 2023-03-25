class EmployeeClass {

    //Instances variable
    private int FileNo;
    private String Name;
    private double Salary;
    
    //Getter of FileNo
    public int getFIleNo(){
        return FileNo;
    }

    //Getter of Name
    public String getName(){
        return Name;
    }

    //Getter of Salary
    public double getSalary(){
        return Salary;
    }

    //Setter on FIleNo
    public void setFileNo(int FileNo){
        this.FileNo = FileNo;
    }

    //Setter of Name
    public void setName(String Name){
        this.Name = Name;
    }

    //Setter of Salary
    public void setSalary(double Salary){
        this.Salary = Salary;
    }

    //No-args Constructor 
    public EmployeeClass(){
        this(0, "", 0.0f);
    }

    //Constructor
    public EmployeeClass(int FileNo, String Name, double Salary){
        this.FileNo = FileNo;
        this.Name = Name;
        this.Salary = Salary;
    }
    
    //Calculation on Tax
    public double calculateTax(){
        return Salary * 0.1;
    }

    //Calcluation on Net Salary
    public double calculateNetSalary(){
        return Salary - calculateTax();
    }

}

public class Employee2{
    public static void main(String[] args) {
        EmployeeClass employee = new EmployeeClass(1, "Blessing", 209.0);
        System.out.printf("My name is = %s with the salary of = %.2f and a networth of = %.2cf", 
                            employee.getName(), employee.calculateTax(), employee.calculateNetSalary()
        );
    }
}