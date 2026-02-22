import java.util.Scanner;

public class StudentArrayOperations {
    int id;
    String name;
    long mobile;


    public StudentArrayOperations(int id, long mobile, String name) {
        this.id = id;
        this.mobile = mobile;
        this.name = name;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array you want :");
        int size = sc.nextInt();
        int[] students = new int[size];
        StudentArrayOperations arrayOperations = null;
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter the " + (i + 1) + " information of the student :");
            System.out.println("Enter the student id : ");
            int id = sc.nextInt();
            System.out.println("Enter the student name :");
            String name = sc.next();
            System.out.println("Enter the student mobile number :");
            long mobile = sc.nextLong();
            arrayOperations = new StudentArrayOperations(id, mobile, name);


        }
        // all information
        // assert : condition = "error message"
        assert arrayOperations != null;
        for (int i = 0; i < students.length; i++) {
            display(arrayOperations);
        }

    }



    public static void display(StudentArrayOperations operations){
        System.out.println(operations.id);
        System.out.println(operations.name);
        System.out.println(operations.mobile);
        System.out.println("-----------------------");
    }
}
