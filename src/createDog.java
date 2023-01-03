public class createDog {
    public static void main(String[] args) {
        // Creating a dog from the dog class called myDog. This is created using the parameterised
        // constructor

        Dog myDog = new Dog("Fred", "Jack Russell", 5);

        // Using the getter getName to display the name of the dog.

        System.out.println(myDog.getName() + " is " + myDog.getAge());

        // Calling a method from the Dog class called gettingOlder

        myDog.gettingOlder();

        // Demonstrating the impact of running gettingOlder method on the dog

        System.out.println(myDog.getName() + " is now " + myDog.getAge());

        // Calling the method from the Dog class called sleep().  Note how all
        // method calls from another class must use the object, which in this case
        // is myDog, which we created above.

        myDog.sleep();



    }
}
