import java.io.*

public class reverseword {
    public static void main(String[] args) {
        String input = "google";
        char[] resultarray = input.toCharArray();
        for (int i = resultarray.length - 1; i >= 0; i--)
            System.out.println(resultarray[i]);
    }

}
