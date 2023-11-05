public class employee {
    //BAse //Super

    private String name;
    private int salary;
    private String department;

    public employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
public void work(){
    System.out.println("Employee is working actively");
}
public void showInfo(){
    System.out.print("Name: "+this.name
            +" Total Salary: "+this.salary
            +" Department: " +this.department
            );



}
public void changeDepartment(String newDepartment ){
    System.out.println("Department is changed...");
    this.department = newDepartment;
    System.out.println("New department: "+this.department);

}
}
