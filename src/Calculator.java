public class Calculator {

    int num1;
    int num2;
    int result;

    public void setNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {

        result = num1 + num2;
        return result;

    }


    public int subtract() {

        result = num1 - num2;
        return result;
    }


    public int multiply() {
        result = 0;

        for (int i = 0; i < num2; i++) {
            result += num1;//result = result + num1;


        }
        return result;
    }


    public int divide() {
        result = 0;
        int quotient = num1;
        while (quotient >= num2){
            quotient -= num2;
            result  ++;
        }
        return result;
    }


    public void displayResult(String operator) {
        System.out.println(num1 + "" + operator +"" + num2 + " = " + result);

    }
}
