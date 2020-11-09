public class Calculator {

    public Calculator() {
    }

    public double add(double a, double b){
        return a+b;
    }

    public double subtract(double a, double b){
        return a-b;
    }

    public double multiply(double a, double b){
        return a*b;
    }

    public double divide(double a, double b){
        return a/b;
    }

    public double mod(double a, double b){
        return a%b;
    }

    public double exponent(double a, double b){
        return Math.pow(a, b);
    }

    public double squareRoot(double a){
        return Math.sqrt(a);
    }
}
