package solid;

import java.security.InvalidParameterException;

interface CalculationOperator {
    int calculate();
}

public class OpenClosed {
    //Bu prensing Single Responsibilityle bağımlıdır.
    //Open kısmını değiştirilebilir olarak düşünebiliriz.
    //Eğer projemize ilerde yeni bir şey eklememiz gerektiğinde open kısmı değiştirmeliyiz.
    //Close kısmı ise asla değişmemelidir.

    public static void main(String[] args) {
        Addition a = new Addition(1, 2);
        Calculator c = new Calculator();
        c.applyCalculation(a);

        Multiply m = new Multiply(2, 5);
        c.applyCalculation(m);
    }

}

class Addition implements CalculationOperator {
    private final int number1;
    private final int number2;


    public Addition(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }


    @Override
    public int calculate() {
        return number1 + number2;
    }
}
//burda sayıları topladık ancak, çarpma işlemi gerçekleştirmek istersek koda değiştirme yaplmak yerine ekleme yapmalıyız.

class Multiply implements CalculationOperator {
    private final int number1;
    private final int number2;

    public Multiply(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }


    @Override
    public int calculate() {
        return number1 * number2;
    }
}

class Calculator {
    void applyCalculation(CalculationOperator calculationOperator) {
        if (calculationOperator == null) throw new InvalidParameterException("Hesaplama yapılamadı");
        else System.out.println(calculationOperator.calculate());
    }//Abstract classs sayesinde yeni bir işlem eklemek istediğimizde yeni bir metoda gerek kalmayacak.
}



