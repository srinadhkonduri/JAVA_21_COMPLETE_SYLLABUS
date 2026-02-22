import java.util.Arrays;

public class ArrayWithMethods {

    public static void main(String[] args) {
        ArrayWithMethods obj = new ArrayWithMethods();
        System.out.println(obj.getName());
        System.out.println(Arrays.toString(obj.getNames()));
        System.out.println(Arrays.toString(obj.getValues1()));
        System.out.println(Arrays.toString(obj.getValues2()));
        System.out.println(Arrays.toString(obj.getValues3()));
    }


    public String getName(){
        return "Tony Stark";
    }


    public String[] getNames(){
        return new String[]{"tony Stark","iron man","captain america"};
    }


    public int[] getValues1(){
        return new int[]{1,2,3,4,5,6,7,8,9};
    }

    public double[] getValues2(){
        return new double[]{23.4,34.5,45.6};
    }

    public long[] getValues3(){
        return new long[]{123,34,22,45};
    }
}
