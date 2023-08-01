//Create a base class to take 2 numbers and in the second class find out the greater number and in the third class perform this operation (a+b)^2 . The result should be returned back in method and each class should inherit other in such a way that by creating object of final child class led to have all other operations.
public class inheritance {
    public static class Inheritance {
        public static void main(String[] args) {
            Num obj = new Num();
            System.out.println("Greater number is " + obj.Greater(4, 2));
            System.out.println("Square of sum is " + obj.Operation(2, 2));

        }
       public static class Numbers {
            public int Greater(int a, int b) {
                if (a > b) {
                    return a;
                } else {
                    return b;
                }
            }
        }
        public static class Num extends Numbers {
            public int Operation(int a, int b) {
                return (int) Math.pow((a + b), 2);
            }
        }


    }


}
