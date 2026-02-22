public class Student {

    static String collegeName = "ABC college";
    int rollNo;
    String name;
    String email;
    String address;
    long mobile;

    public Student(String address, String email, long mobile, String name, int rollNo) {
        this.address = address;
        this.email = email;
        this.mobile = mobile;
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "address='" + address + '\'' +
                ", rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                ", collegeName = " + collegeName +
                '}';
    }

    public static void main(String[] args) {
        Student student1 = new Student("uppal","Srinadh@gmail.com",1234567890,"srinadh",123);
        Student student2 = new Student("uppal","Srinadh@gmail.com",1234567890,"srinadh",123);

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        int x = Integer.MAX_VALUE;
        x = x + 1;
        System.out.println(x);
    }
}
