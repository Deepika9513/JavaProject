public class palindrome {
    public static void main(String args[]) {
        int reversed_N = 0;
        //int reverse n = reversNumber(n);
        //System.out.println("Reverse of n = " + (reverseN));
        int n = 707;
        while (n > 0) {
       //     reversed_n = reversed_n * 10 + n % 10;
            n = n / 10;
        }
        if(n== reversed_N)
        {

            System.out.println("Palindrome = Yes");
        }
        else{
            System.out.println("Palindrome = No");
        }
    }
}