public class V2L22 {
    public static void main(String[] args) {

        //Declare some variables
        int num1 = 7;
        float num2 = 18.01f;
        String name = "Joe Bloggs";
        boolean gender = true;
        int[] arr = new int[5];
        int[] arr2 = {5, 2, 6, 3, 7, 2};

        // Selection using a conditional statement
        if (num1 == 25) {
            System.out.println("The value of the variable is 25");

        } else {
            System.out.println("The value of the variable does not equal 25");
        }

        // Example of iteration (a loop)
        for (int i = 0; i < 5; i++) {
            System.out.println("This line will be printed out 5 times. The number is:" + (i + 1));
        }

        //Calling a method
        int myAge = 16;
        yourNextBirthday(myAge);
    }

        // A method which exists outside of main method
        public static void yourNextBirthday(int age) {
            age++;
            System.out.println("On your next birthday you will be " + age + " years old.");

        }



    }



