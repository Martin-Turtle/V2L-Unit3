public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public Dog() {
        name = "";
        breed = "";
        age = 0;
    }

    public String getName() {
    return name;
    }

    public void setName(String name) {
    this.name = name;
    }

    public String getBreed() {
    return breed;
    }

    public void setBreed(String breed) {
    this.breed = breed;
    }

    public String getAge() {
    return (age + " years old");
    }

    public void setAge(int age) {
        this.age = age;
    }
// Examples of class methods

    public void gettingOlder(){
        age++;
    }

    public void eat() {
        System.out.println("Nom, Nom, Nom!");
    }

    public void sleep() {
        System.out.println("ZZZZZZzzzzzzzzzzz!");
    }



}

