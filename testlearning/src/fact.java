import java.util.Scanner;
class A{
        //Factorial =5!=5*4!
        public  int factorial(int n){  // factorial---> name of the method n=5
            if (n==1){
                return n;
            }else {
                System.out.println("value of n is ="+n);
                return n*factorial(n-1); // 5*4*3*2*
            }
        }

    }
    public class fact {
        public static void main(String[] args) {
            A obj=new A();
            System.out.println(obj.factorial(5));
        }
    }

