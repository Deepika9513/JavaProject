public class random1 {
        public static int Ran() {

            int random = (int) (Math.random() * 100);
            return random;
        }

        public static void main(String[] args) {

            System.out.println("Random Number is " + Ran());
        }
    }

