public class Main {

    public static void main(String[] args) {

        String filename = "numbers.txt";

        Calculator calculator = new Calculator(filename);

        System.out.println("Addition:" + calculator.calculate("add"));
        System.out.println("Subtraction:" + calculator.calculate("subtract"));
        System.out.println("Multiplication:" + calculator.calculate("multiply"));
        System.out.println("Division:" + calculator.calculate("divide"));

    }
    
}