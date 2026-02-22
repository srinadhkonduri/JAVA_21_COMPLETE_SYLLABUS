import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example {




    // we should add (new <Class Name>) for executing this block
    {
        System.out.println("instance block");
    }

    public Example() {
        System.out.println(
                "constructor executed"
        );
    }

    static void hello(){
        System.out.println("static block executed");
    }
    public static void main(String[] args) {
        new Example();

    }
}
