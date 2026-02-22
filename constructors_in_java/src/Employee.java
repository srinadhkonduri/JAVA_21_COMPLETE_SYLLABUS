
public class Employee {

    int id;
    String name;
    public Employee() {
        System.out.println("The constructor is executed in the constructor");
    }

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }



    public static void main(String[] args) {
        System.out.println("main method executed");

        // creating an object for the constructor
        Employee main = new Employee();
        Employee employee = new Employee(1,"tony");
        main.display(employee);
    }


    public void display(Employee employee){
        System.out.println(employee.id);
        System.out.println(employee.name);
    }
}