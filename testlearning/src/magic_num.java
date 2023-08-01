
public class magic_num {

    public static void main(String[] args) {
        magic_num obj = new magic_num();
        obj.mgn(28);

    }

    public void mgn(int n) {
        int r, s;
        while (n > 9) {
            s = 0;
            while (n != 0) {
                r = n % 10;
                s = s + r;
                System.out.println("value of s =" +s);
                n = n / 10;
                System.out.println("value of n =" +n);
            }
            n = s;
            System.out.println("value of last n =" +n);
        }
        if (n == 1) {
            System.out.println("its an magic number");
        } else {
            System.out.println("its not an magic number");
        }
    }
}
