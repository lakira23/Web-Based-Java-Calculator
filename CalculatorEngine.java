public class CalculatorEngine {
    
    public int Add(int num1,int num2){
        return num1 + num2;
    }

    public int Subtract(int num1,int num2){
        return num1 - num2;
    }

    public double Divide(int num1,int num2){
        return num1 / num2;
    }
    
    public int Multiply(int num1, int num2){
        return num1 * num2;
    }

    public int Square(int num1, int num2){
        return (int) Math.pow(num1,num2);

    }
}