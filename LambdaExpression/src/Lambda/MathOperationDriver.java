package Lambda;

public class MathOperationDriver {
    public static void main(String[] args) {

        //without Lambada
        MathOperation operation = new MathOperation() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };
        int sumOfTwoNumber = operation.add(5, 5);
        System.out.println("Result: " + sumOfTwoNumber);

        //lambada with no return
        MathOperation sum = (num1, num2) -> (num1 + num2);
        System.out.println(sum.add(10, 20));

        //Lambada with return
        MathOperation add = (int num1, int num2) -> {
            return (num1 + num2);
        };
        System.out.println(sum.add(3, 4));
    }

}
