public class UsingIterations {
    public static void main(String[] args) {
        int num1 = 1;
        System.out.println("Loop will stop when num1 = 10");

        while (num1 < 10){
            System.out.println("Condition is not meet. Num1 is " + num1);
            num1++;
        }
        System.out.println("Condition is met. Num1 is " + num1);
    }
}
