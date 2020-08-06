import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Calculator {

    public double[] numbers;

    public Calculator(String filename) {
        this.numbers  = initNumbersArray(filename);
    }

    public double calculate(String op) {
        double product = this.numbers[0];
        for(int i = 1; i < this.numbers.length - 1; i++) {
            product = operate(op, product, numbers[i]);
        }

        return product;
    }

    public double operate(String op, double a, double b) {
        switch(op) {
            case "add": 
                return a + b;
            case "subtract": 
                return a - b;
            case "multiply": 
                return a * b;
            case "divide": 
                return a / b;
            default: 
                System.out.println("Invalid Operation String");
                return 0;
        }
    }

    public double[] initNumbersArray(String filename) {
        double[] numbersList;

        ArrayList<String> someNumbers = new ArrayList<String>();

        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] aFewNumbers = data.split(" ");
                Collections.addAll(someNumbers, aFewNumbers);
            }

            numbersList = new double[someNumbers.size()];

            for(int i = 0; i < someNumbers.size(); i++) {
                numbersList[i] = Double.parseDouble(someNumbers.get(i));
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            numbersList = new double[0];
        }

        return numbersList;

    }

    

}