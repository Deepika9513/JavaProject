public class maths {
    public static void main(String[] args )
    {
    System.out.print("Enter two numbers: \n");
    Scanner obj= new Scanner(System.in);
    double first = obj.nextDouble();
    double second = obj.nextDouble();
System.out.print("Enter an operator (+, -, *, /): \n");
    char operator = obj.next().charAt(0);
    double result;
switch(operator) {
    case '+':
        result = first + second;
        break;
    case '-':
        result = first - second;
        break;
    case '*':
        result = first * second;
        break;
    case '/':
        result = first / second;
        break;
}
}
}
