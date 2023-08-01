import java.io.BufferedReader;

public class reverse {
    public static void main(String[] args) {
        String input="madam";
        char[] result_array=input.toCharArray();
        for(int i= result_array.length-1;i>=0;i--)
            System.out.println(result_array[i]);
    }

}
