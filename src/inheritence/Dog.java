package inheritence;

public class Dog extends Animal {

    private String weight;

    public Dog(String name, int age, String weight) {
        super(name, age);
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight='" + weight + '\'' + "\n" +
                super.toString() + '}';
    }
}
