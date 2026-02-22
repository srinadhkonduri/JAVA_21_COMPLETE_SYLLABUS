import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String names = "Tony Stark is Iron Man";
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        int result = addition();
        System.out.println(result);
        System.out.println(addition());
        System.out.println(mul(3,67));
        printName("Tony Stark");
        printDetails("Tony@gmail.com",34);
        Main main = new Main();
        main.nonStaticMethod("captain",70,1234567890L);
        System.out.println("a" + "b" + "c");
        System.out.println(" ".length());
        System.out.println(names.substring(1,3));
        System.out.println(names.replace('o','A'));
        System.out.println(names.replaceFirst("\\s+","A"));
        String[] arr = "a|b|c|d".split("\\|");
        System.out.println(Arrays.toString(arr));
    }


    public static int addition(){
        int x = 30;
        int y = 20;
        int result = x + y;
        System.out.println(result);
        return 70;
    }

    public static int mul(int a, int b){
        return a * b;
    }

    public static void printName(String name){
        System.out.println(name);
    }

    public static void  printDetails(String email, int age){
        System.out.println(email + " , " + age);
    }


    public void nonStaticMethod(String name, int age, long mobile){
        System.out.println(name + ", " + age + ", " + mobile);
    }
}