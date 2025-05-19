public class Problem1{

    public static void main(String[] args) {
        double a = 10.5;
        double b = 7.5;
        String operation = "add";

        double result = calculator(a,b,operation);
        System.out.println("Result is = "+result);
    }

    public static double calculator(double a , double b , String operation){
        switch (operation.toLowerCase()){
            case "add" : return a+b;
            case "substract" : return a-b;
            case "multiply" : return a * b;
            case "divide" : if (b!=0) return a/b; else throw new ArithmeticException("cant divie by zero");
            default : throw new IllegalArgumentException("Invalid Operation");
        }
    }

}


